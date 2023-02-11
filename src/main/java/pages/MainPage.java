package pages;

import com.codeborne.selenide.SelenideElement;
import core.BaseClass;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BaseClass {

    public final String BASE_URL = "https://stellarburgers.nomoreparties.site";
    public final SelenideElement PRODUCT_TEXT = $x("//h1[contains(.,'Соберите бургер')]");

    public SelenideElement PROFILE = $x("//p[contains(.,'Личный Кабинет')]");
    public SelenideElement CONSTRUCTOR_BUTTON = $x("//p[contains(.,'Конструктор')]");
    public final SelenideElement LOGO = $x("//div[contains(@class,'AppHeader_header__logo')]");
    public final SelenideElement INIT_TEXT = $x("//h2[contains(.,'Вход')]");

    @Step("Go to profile")
    public void enterProfile(){
        commonActions.click(PROFILE);
    }
}
