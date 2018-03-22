package ui.page_objects;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;

public class ProfilePage {
    public NavBar navBar = new NavBar();
    @Step
    public ElementsCollection getMyBoards(){
        return $$(".board-item");
    }
    @Step
    public String getLastBoardName(){
        return getMyBoards().get(0).find(".board-name").getText();
    }
    @Step
    public void deleteLastBoard(){
        getMyBoards().get(0).find(".delete-board-desktop").shouldBe(visible).click();
        switchTo().alert().accept();
    }
}
