package actions;

import org.openqa.selenium.WebElement;

public class Actions {
    public static void sendKey(WebElement element,String values) {
        element.sendKeys(values);
    }

    public static void isDisplayed(WebElement element) {
        element.isDisplayed();
    }

    public static void click(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
    }
}

