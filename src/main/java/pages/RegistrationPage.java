package pages;

import com.codeborne.selenide.SelenideElement;
import core.BaseClass;
import core.PropertyReader;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage extends BaseClass {
    public final SelenideElement NAME_FIELD = $x("//label[text()='Имя']//following::input[1]");
    public final SelenideElement EMAIL_FIELD = $x("//label[text()='Email']//following::input[1]");
    public final SelenideElement PASSWORD_FIELD = $x("//input[@type='password']");
    public final SelenideElement REGISTRATION_BUTTON = $x("//button[contains(.,'Зарегистрироваться')]");
    public final SelenideElement ERROR_MESSAGE = $x("//p[contains(.,'Некорректный пароль')]");
    public final SelenideElement REDIRECT_TO_LOGIN_BUTTON = $x("//a[@href='/login']");

    @Step("Enter correct data for registration")
    public void enterCorrectDataForRegistration() {
        commonActions.enterText(NAME_FIELD, PropertyReader.name)
                .enterText(PASSWORD_FIELD,PropertyReader.passwordForRegistration);
        commonActions.enterText(EMAIL_FIELD,PropertyReader.emailForRegistration)
                .click(REGISTRATION_BUTTON);
    }

    @Step("Enter incorrect data for registration")
    public void enterInCorrectDataForRegistration() {
        commonActions.enterText(NAME_FIELD, PropertyReader.name)
                .enterText(PASSWORD_FIELD,PropertyReader.badPassword);
        commonActions.enterText(EMAIL_FIELD,PropertyReader.badEmail)
                .click(REGISTRATION_BUTTON);
    }

}
