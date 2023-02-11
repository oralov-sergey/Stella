import core.BaseClass;
import core.PropertyReader;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest extends BaseClass {

    public final String PRODUCT_NAME = "Соберите бургер";
    public final String ERROR_MESSAGE = "Некорректный пароль";

    @Test
    public void RegistrationWithCorrectPassword() {
        loginPage.chooseRegistration();
        registrationPage.enterCorrectDataForRegistration();
        loginPage.logInToWebSite(PropertyReader.emailForRegistration, PropertyReader.passwordForRegistration);

        Assert.assertEquals(PRODUCT_NAME, commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));
    }

    @Test
    public void RegistrationWithInCorrectPassword(){
        loginPage.chooseRegistration();
        registrationPage.enterInCorrectDataForRegistration();

        Assert.assertEquals(ERROR_MESSAGE, commonActions.getTextFromElement(registrationPage.ERROR_MESSAGE));
    }

    @Test
    public void a(){
        System.out.println(PropertyReader.badEmail);
    }
}