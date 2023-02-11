package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import core.BaseClass;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BaseClass {

    public final String LOGIN_URL = "https://stellarburgers.nomoreparties.site/login";
    public final SelenideElement REGISTRATION_LINK = $x("//a[contains(.,'Зарегистрироваться')]");
    public final SelenideElement EMAIL_FIELD = $x("//label[text()='Email']//following::input[1]");
    public final SelenideElement PASSWORD_FIELD = $x("//input[@type='password']");
    public final SelenideElement LOGIN_BUTTON = $x("//button[contains(.,'Войти')]");
    public final SelenideElement FORGOT_PASSWORD_LINK = $x("//a[@href='/forgot-password']");


    @Step("Choose registration")
    public void chooseRegistration() {
        commonActions.openWebsite(LOGIN_URL)
                .click(REGISTRATION_LINK);
    }

    @Step("Logging")
    public void logInToWebSite(String email, String password){
        LOGIN_BUTTON.shouldBe(Condition.appear);
        commonActions.enterText(PASSWORD_FIELD, password)
                .enterText(EMAIL_FIELD, email)
                .click(LOGIN_BUTTON);
    }


}
