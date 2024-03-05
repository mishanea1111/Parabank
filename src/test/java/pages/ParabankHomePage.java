package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankHomePage extends PageObjects {
    @FindBy(xpath = "//*[@id=\"topPanel\"]/a[2]/img")
    WebElement homePageLogoText;

    @FindBy(xpath = "//input[@value = 'Log In']")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    WebElement errorMessage;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    @FindBy(xpath = "//b[normalize-space()='Username']")
    WebElement username;

    @FindBy(xpath = "//b[normalize-space()='Password']")
    WebElement password;

    public ParabankHomePage(WebDriver driver) {
        super(driver);
    }

}
