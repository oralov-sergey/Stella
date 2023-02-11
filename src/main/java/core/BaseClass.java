package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import pages.*;

public class BaseClass {
    public static CommonActions commonActions;
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public PropertyReader propertyReader;
    public MainPage mainPage;
    public ProfilePage profilePage;
    public ConstructorPage constructorPage;


    @Before
    public void start() {
        Configuration.startMaximized = true;
        commonActions = new CommonActions();
        this.loginPage = new LoginPage();
        this.registrationPage = new RegistrationPage();
        this.propertyReader = new PropertyReader();
        this.mainPage = new MainPage();
        this.profilePage = new ProfilePage();
        this.constructorPage = new ConstructorPage();
        Configuration.browser="chrome";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }


    @After
    public void closeWebDriver(){
        Selenide.closeWebDriver();
    }
}
