package ui.page_objects;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("перейти на страницу login https://www.istockphoto.com/sign-in?returnurl=%2F")
    public LoginPage open(){
        Selenide.open("/sign-in?returnurl=%2F");
        return this;
    }


    @Step
    public LoginPage enterLogin(String login){
        $(By.id("new_session_username")).setValue(login);
        return this;
    }

    @Step
    public LoginPage enterPassword(String password){
        $(By.id("new_session_password")).setValue(password);
        return this;
    }

    @Step
    public MainAppPage logIn(){
        $(By.id("sign_in")).click();
        return new MainAppPage();
    }
}
