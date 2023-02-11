package core;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class CommonActions extends BaseClass {

    @Step("Open Website: {url}")
    public CommonActions openWebsite(String url) {
        open(url);
        return this;
    }

    @Step("Click the button")

    public CommonActions click(SelenideElement locator) {
        locator.click();
        return this;
    }

    @Step("Enter text: {text}")
    public CommonActions enterText(SelenideElement locator, String text) {
        locator.clear();
        locator.sendKeys(text);
        return this;
    }

    @Step("Get text")
    public String getTextFromElement(SelenideElement locator) {
        locator.shouldBe(Condition.appear);
        return locator.getText();
    }

}