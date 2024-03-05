package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankLogin extends PageObjects {

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginbutton;

    @FindBy(xpath = "//p[@class='error']")
    WebElement Please_enter_a_username_and_password;

    public ParabankLogin(WebDriver driver) {
        super(driver);
    }
}
