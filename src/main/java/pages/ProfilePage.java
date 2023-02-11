package pages;

import com.codeborne.selenide.SelenideElement;
import core.BaseClass;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage extends BaseClass {

    public final SelenideElement PROFILE_TEXT = $x("//a[@href='/account/profile']");
    public final SelenideElement EXIT_BUTTON = $x("//button[contains(.,'Выход')]");


}
