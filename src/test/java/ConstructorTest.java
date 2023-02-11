import core.BaseClass;
import core.PropertyReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorTest extends BaseClass {

    public final String BREAD_SECTION_NAME = "Булки";
    public final String SAUSE_SECTION_NAME = "Соусы";
    public final String FILLING_SECTION_NAME = "Начинки";

    @Before
    public void autorization(){
        commonActions.openWebsite(loginPage.LOGIN_URL);
        loginPage.logInToWebSite(PropertyReader.myEmail, PropertyReader.myPassword);
    }

    @Test
    public void redirectToBreadSection(){
        constructorPage.redirectToSection(constructorPage.FILLING_LINK)
                .redirectToSection(constructorPage.BREAD_LINK);

        Assert.assertEquals(BREAD_SECTION_NAME, commonActions.getTextFromElement(constructorPage.NAME_OF_BREAD_SECTION));
    }

    @Test
    public void redirectToSauseSection(){
        constructorPage.redirectToSection(constructorPage.SAUSE_LINK);

        Assert.assertEquals(SAUSE_SECTION_NAME, commonActions.getTextFromElement(constructorPage.NAME_OF_SAUSE_SECTION));
    }

    @Test
    public void redirectToFillingSection(){
        constructorPage.redirectToSection(constructorPage.FILLING_LINK);

        Assert.assertEquals(FILLING_SECTION_NAME, commonActions.getTextFromElement(constructorPage.NAME_OF_FILLING_SECTION));

    }
}

