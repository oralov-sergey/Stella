import com.codeborne.selenide.Condition;
import core.BaseClass;
import core.PropertyReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProfileTest extends BaseClass {
    public final String PROFILE_TEXT = "Профиль";
    public final String PRODUCT_TEXT = "Соберите бургер";
    public final String INIT_TEXT = "Вход";

    @Before
    public void autorization(){
        commonActions.openWebsite(loginPage.LOGIN_URL);
        loginPage.logInToWebSite(PropertyReader.myEmail, PropertyReader.myPassword);
    }


    @Test
    public void redirectToProfile(){
        commonActions.click(mainPage.PROFILE);

        Assert.assertEquals(PROFILE_TEXT,commonActions.getTextFromElement(profilePage.PROFILE_TEXT));
    }

    @Test
    public void redirectFromProfileByConstructorButton(){
        commonActions.click(mainPage.PROFILE)
                .click(mainPage.CONSTRUCTOR_BUTTON);

        Assert.assertEquals(PRODUCT_TEXT,commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));
    }

    @Test
    public void redirectFromProfileByLogo(){
        commonActions.click(mainPage.PROFILE)
                .click(mainPage.LOGO);

        Assert.assertEquals(PRODUCT_TEXT,commonActions.getTextFromElement(mainPage.PRODUCT_TEXT));
    }

    @Test
    public void logout(){
        commonActions.click(mainPage.PROFILE)
                .click(profilePage.EXIT_BUTTON);

        Assert.assertEquals(INIT_TEXT,commonActions.getTextFromElement(mainPage.INIT_TEXT));
        Assert.assertTrue("Field is not empty", loginPage.EMAIL_FIELD.is(Condition.empty));
    }

}
