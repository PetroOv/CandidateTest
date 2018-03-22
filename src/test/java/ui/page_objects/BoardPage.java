package ui.page_objects;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BoardPage {
    public NavBar navBar = new NavBar();

    public ElementsCollection getPhotosInBoard() {
        return $$(".board-item-content");
    }

    @Step
    public BoardPage deleteSelectedPhotos() {
        selectPhoto(getFirstPhotoInCategory());
        $(".outline.clear-all").click();
        return this;
    }

    public void deleteThisBoard() {
        $(".delete-board");
        switchTo().alert().accept();
    }
    @Step
    public ElementsCollection getPhotos(){
        return $$(".board-item-content");
    }
    @Step
    public SelenideElement getFirstPhotoInCategory(){
        return getPhotos().get(0);
    }
    @Step
    public String selectPhoto(SelenideElement photo){
        photo.find(".checkbox").click();
        return photo.find(".asset-id").waitUntil(visible,10000).getText();
    }
}
