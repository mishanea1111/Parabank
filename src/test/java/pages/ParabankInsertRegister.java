package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankInsertRegister extends PageObjects {

    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement confirm;

    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement userNameField;


    public ParabankInsertRegister(WebDriver driver) {
        super(driver);
    }
}
