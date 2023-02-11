import core.BaseClass;
import core.PropertyReader;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseClass {

    public final String PRODUCT_NAME = "Соберите бургер";

    @Test
    public void enterByLoginButton() {
        commonActions.openWebsite(loginPage.LOGIN_URL);
        loginPage.logInToWebSite(PropertyReader.myEmail, PropertyReader.myPassword);
        Assert.assertEquals(PRODUCT_NAME, commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));
    }

    @Test
    public void enterByProfile() {
        commonActions.openWebsite(mainPage.BASE_URL);
        mainPage.enterProfile();
        loginPage.logInToWebSite(PropertyReader.myEmail, PropertyReader.myPassword);
        Assert.assertEquals(PRODUCT_NAME, commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));
    }

    @Test
    public void enterByRegistrationPage() {
        loginPage.chooseRegistration();
        commonActions.click(registrationPage.REDIRECT_TO_LOGIN_BUTTON);
        loginPage.logInToWebSite(PropertyReader.myEmail, PropertyReader.myPassword);
        Assert.assertEquals(PRODUCT_NAME, commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));
    }

    @Test
    public void enterByReturnPasswordPage() {
        commonActions.openWebsite(loginPage.LOGIN_URL);
        commonActions.click(loginPage.FORGOT_PASSWORD_LINK)
                .click(registrationPage.REDIRECT_TO_LOGIN_BUTTON);
        loginPage.logInToWebSite(PropertyReader.myEmail, PropertyReader.myPassword);
        Assert.assertEquals(PRODUCT_NAME, commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));

    }
}
