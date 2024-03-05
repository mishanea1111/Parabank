package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankRegister extends PageObjects {

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerbutton;

    @FindBy(xpath = "//h1[normalize-space()='Signing up is easy!']")
    WebElement sign_up_is_easy;

    @FindBy(xpath = "//b[normalize-space()='First Name:']")
    WebElement firstname;

    @FindBy(xpath = "//b[normalize-space()='Last Name:']")
    WebElement lastname;

    @FindBy(xpath = "//b[normalize-space()='Username:']")
    WebElement username;

    @FindBy(xpath = "//b[normalize-space()='Password:']")
    WebElement password;

    @FindBy(xpath = "//b[normalize-space()='Confirm:']")
    WebElement confirm;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement zip_code;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement phone;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement SSN;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement register_cu_datele;

    @FindBy(xpath = "//*[@id=\"customer.address.street.errors\"]")
    WebElement Address_error;

    @FindBy(xpath = "//span[@id='customer.address.city.errors']")
    WebElement City_error;

    @FindBy(xpath = "//span[@id='customer.address.state.errors']")
    WebElement State_error;

    @FindBy(xpath = "//span[@id='customer.address.zipCode.errors']")
    WebElement Zipcode_error;

    @FindBy(xpath = "//span[@id='customer.ssn.errors']")
    WebElement SSN_error;

    public ParabankRegister(WebDriver driver) {
        super(driver);
    }
}
