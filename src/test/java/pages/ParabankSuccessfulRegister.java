package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankSuccessfulRegister extends  PageObjects {

    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
    WebElement successfully_registered;

    public ParabankSuccessfulRegister(WebDriver driver) {
        super(driver);
    }
}
