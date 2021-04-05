package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }
    private By inputField = By.id("target");

    public void enterkeyPress(String data){
        driver.findElement(inputField).sendKeys(data);
    }
}
