package ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import ui.page_objects.*;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(DataProviderRunner.class)
public class SelenideTest {

    @Rule
    public BrowserWebDriverContainer firefoxContainer = new BrowserWebDriverContainer("selenium/standalone-firefox-debug:3.3.0")
            .withDesiredCapabilities(DesiredCapabilities.firefox())
            .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.SKIP, new File("./target/"));

    @Rule
    public BrowserWebDriverContainer chromeContainer = new BrowserWebDriverContainer()
            .withDesiredCapabilities(DesiredCapabilities.chrome())
            .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.SKIP, new File("./target/"));


    @DataProvider(format = "%m [%p[0]]")
    public static Object[][] dataProviderTimesTabs() {
        return new Object[][]{
                {"chrome"},
                {"firefox"}
        };
    }


    public void setUp(String browser) {
        RemoteWebDriver driver;
        if (browser.equals("chrome")) {
            driver = chromeContainer.getWebDriver();
            firefoxContainer.stop();
        } else {
            driver = firefoxContainer.getWebDriver();
            chromeContainer.stop();
        }
        WebDriverRunner.setWebDriver(driver);
        Configuration.browser = "chrome";
        Configuration.timeout = 4000;
        Configuration.baseUrl = "https://www.istockphoto.com";
    }

    @After
    public void tearDown() {
        if (WebDriverRunner.getWebDriver() != null)
            WebDriverRunner.closeWebDriver();
    }


    @Test
    @UseDataProvider(value = "dataProviderTimesTabs")
    public void pageObjectTest(String browser) {
        setUp(browser);
        LoginPage loginPage = new LoginPage();
        MainAppPage mainAppPage = loginPage.open().enterLogin(TestData.LOGIN.getValue()).enterPassword(TestData.PASSWORD.getValue()).logIn();
        mainAppPage.navBar.openCreateBoardModal().createBoard(TestData.TESTBOARD.getValue());
        ProfilePage profilePage = mainAppPage.navBar.openMyBoards();
        assertThat("board didn't create", profilePage.getLastBoardName(), equalTo(TestData.TESTBOARD.getValue()));
        PhotosPage photosPage = profilePage.navBar.openPhotos();
        String selectedPhotoID = photosPage.selectPhoto(photosPage.selectPhotosCategory().getFirstPhotoInCategory());
        BoardPage boardPage = photosPage.copyPhotosToBoard(TestData.TESTBOARD.getValue());
        assertThat("", boardPage.selectPhoto(boardPage.getFirstPhotoInCategory()), equalTo(selectedPhotoID));
        boardPage.deleteSelectedPhotos();
        profilePage = boardPage.navBar.openMyBoards();
        profilePage.deleteLastBoard();
        System.out.println(profilePage.getLastBoardName());
        profilePage.navBar.logOut();
    }
}
