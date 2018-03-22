package ui.page_objects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class NavBar {
    @Step
    public NavBar createBoard(String boardName){
        $(".enter-board-name").setValue(boardName).pressEnter();
        return this;
    }
    @Step
    public NavBar  openCreateBoardModal(){
        actions().moveToElement(getElement(By.cssSelector("#open_board"))).pause(1000).moveToElement(getElement(By.cssSelector(".boards-menu-container"))).pause(1000).click(getElement(By.cssSelector("a.create-board-link"))).build().perform();
        return  this;
    }
    @Step
    public ProfilePage openMyBoards(){
        actions().moveToElement(getElement(By.cssSelector("#open_board"))).pause(1000).moveToElement(getElement(By.cssSelector(".boards-menu-container"))).pause(1000).click(getElement(By.cssSelector("a.view-board-link"))).build().perform();
        return new ProfilePage();
    }
    @Step
    public PhotosPage openPhotos(){
        $(By.linkText("Photos")).click();
        return  new PhotosPage();
    }
    @Step
    public void logOut(){
        $$("li[data-istock-user-id='14264958']").get(1).waitUntil(Condition.visible,10000).click();
        $("#hypSignOut").click();
    }
}
