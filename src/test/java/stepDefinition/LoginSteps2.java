package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.Getter;
import util.DataKey;

import static actions.Actions.click;
import static actions.Actions.isDisplayed;
import static actions.Actions.sendKey;
import static util.ScenarioContext.saveData;
import static util.ScenarioContext.getData;
import static util.ScenarioContext.saveData;
import static util.WaitUntil.waitUntilTime;


public class LoginSteps2 extends AbstractStep {
    @Given("User navigate to the website1 homepage")
    public void user_navigate_to_the_website_homepage() throws InterruptedException {
        click(parabankHomePage.getLoginButton());
        isDisplayed(parabankHomePage.getErrorMessage());
    }

    @When("User click on 'Login' button1")
    public void User_click_on_Login_button1() throws InterruptedException {
        click(parabankHomePage.getLoginButton());
        isDisplayed(parabankLogin.getPlease_enter_a_username_and_password());
    }

    @When("User click on 'Register' button2")
    public void User_click_on_Register_button() throws InterruptedException {
        click(parabankRegister.getRegisterbutton());
        isDisplayed(parabankRegister.getSign_up_is_easy());
    }

    @When("User didnt complete all the fields")
    public void User_didnt_complet_all_the_fields() throws InterruptedException {
        saveData(DataKey.USERNAME, parabankRegister.getUsername());
        saveData(DataKey.PASSWORD, parabankRegister.getPassword());
        sendKey(parabankInsertRegister.getFirstname(), "Dry");
        sendKey(parabankInsertRegister.getLastname(), "Rht");
        sendKey(parabankInsertRegister.getUsername(), "malai5");
        sendKey(parabankInsertRegister.getPassword(), "loh12345_@");
        sendKey(parabankInsertRegister.getConfirm(), "loh12345_@");
        click(parabankRegister.getRegister_cu_datele());
        isDisplayed(parabankRegister.getAddress_error());
        isDisplayed(parabankRegister.getCity_error());
        isDisplayed(parabankRegister.getState_error());
        isDisplayed(parabankRegister.getZipcode_error());
        isDisplayed(parabankRegister.getSSN_error());
        Thread.sleep(1000);
    }

    @When("User click on 'register' with all the data inserted")
    public void User_click_on_register_with_all_the_data_inserted() throws InterruptedException {
        sendKey(parabankRegister.getAddress(), "Grenoble");
        sendKey(parabankRegister.getCity(), "Chisinau");
        sendKey(parabankRegister.getState(), "Moldova");
        sendKey(parabankRegister.getZip_code(), "37");
        sendKey(parabankRegister.getPhone(), "069495937");
        sendKey(parabankRegister.getSSN(), "501-502");
        sendKey(parabankInsertRegister.getPassword(), "loh1234_@");
        sendKey(parabankInsertRegister.getConfirm(), "loh1234_@");
        click(parabankRegister.getRegister_cu_datele());
        isDisplayed(parabankSuccesfulRegister.getSuccessfully_registered());
        Thread.sleep(2000);
    }

    @When("User give {}")
    public void user_give_userName(String userName) throws InterruptedException {
        saveData(DataKey.USERNAME,userName);
        isDisplayed(parabankRegister.getSign_up_is_easy());
        sendKey(parabankRegister.getZip_code(),getData(DataKey.USERNAME).toString());
        Thread.sleep(2000);
    }

    @Given("User navigate to the website2 homapage")
    public void User_navigate_to_the_website2_homepage() throws InterruptedException {
        click(parabankRegister.getRegisterbutton());
        sendKey(parabankInsertRegister.getUserNameField(), "mamam");
    }
}
