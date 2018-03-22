package ui.page_objects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PhotosPage {
    public NavBar navBar = new NavBar();

    @Step
    public PhotosPage selectPhotosCategory(){
        $$(".clipper a").get(0).click();
        return this;
    }

    @Step
    public SelenideElement getFirstPhotoInCategory(){
        return $$(".board-item-content").get(0);
    }

    @Step
    public String selectPhoto(SelenideElement photo){
        photo.find(".checkbox").waitUntil(visible,10000).click();
        return photo.find(".asset-id").waitUntil(visible,10000).getText();
    }

    @Step
    public void openSelectedPhotosModal(){
        $(".actions-modal-button").click();
    }
    @Step
    public void copyPhotosInModal(){
        $(".option-container h2").click();
    }

    @Step
    public BoardPage copyPhotosToBoard(String boardName){
        openSelectedPhotosModal();
        copyPhotosInModal();
        $$("a[ng-bind='board.name']").find(text(boardName)).click();
        return  new BoardPage();
    }
}
