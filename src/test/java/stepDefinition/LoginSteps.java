package stepDefinition;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ScenarioContext;
import util.DataKey;

import static actions.Actions.isDisplayed;

public class LoginSteps extends AbstractStep {
    private ChromeDriver driver;

    @When("User navigate to the website homepage")
    public void User_navigate_to_the_website_homepage() {
        System.setProperty("webdriver.chrome.driver", "src\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        if (driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed())
            log.info("parabank logo este ");
        if (driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed())
            log.info("customer login este ");

    }

    @When("User click on 'Login' button")
    public void user_click_on_Login_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).isDisplayed();
        log.info("Please enter an username and password");
        Thread.sleep(1000);

    }

    @When("User click on 'Register' button")
    public void user_click_on_Register_button() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        log.info("click on register button");
        if (driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']")).isDisplayed())
            log.info("Signing up is easy! ");
        if (driver.findElement(By.xpath("//b[normalize-space()='Username:']")).isDisplayed())
            log.info("Username: ");
        if (driver.findElement(By.xpath("//b[normalize-space()='Password:']")).isDisplayed())
            log.info("Password: ");
        if (driver.findElement(By.xpath("//b[normalize-space()='Confirm:']")).isDisplayed())
            log.info("Confirm: ");
        Assert.assertEquals("Confirm:", driver.findElement(By.xpath("//b[normalize-space()='Confirm:']")).getText());
        Thread.sleep(1000);
    }

    @When("User insert some of the mandatory fields")
    public void user_insert_some_of_the_mandatory_fields() throws InterruptedException {
        String firstName = "sorin";
        String password = "sorin loh mare";
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstName);
        ScenarioContext.saveData(DataKey.USERNAME, firstName);
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("loh");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
        ScenarioContext.saveData(DataKey.PASSWORD, password);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        log.info("click on register button again");
        Thread.sleep(5000);
    }


}
