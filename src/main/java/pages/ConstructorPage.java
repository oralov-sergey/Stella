package pages;

import com.codeborne.selenide.SelenideElement;
import core.BaseClass;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ConstructorPage extends BaseClass {

    public final SelenideElement BREAD_LINK = $x("//span[contains(.,'Булки')]");
    public final SelenideElement NAME_OF_BREAD_SECTION = $x("//h2[contains(.,'Булки')]");
    public final SelenideElement SAUSE_LINK = $x("//span[contains(.,'Соусы')]");
    public final SelenideElement NAME_OF_SAUSE_SECTION = $x("//h2[contains(.,'Соусы')]");
    public final SelenideElement FILLING_LINK = $x("//span[contains(.,'Начинки')]");
    public final SelenideElement NAME_OF_FILLING_SECTION = $x("//h2[contains(.,'Начинки')]");

    @Step("Redirect to section")
    public ConstructorPage redirectToSection(SelenideElement locator) {
        commonActions.click(locator);
        return this;
    }


}

