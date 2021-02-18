package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage {

    private WebDriver driver;


    private final By secureAreaText = By.id("flash-messages");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String secureAreaText(){
       return driver.findElement(secureAreaText).getText();

    }
}
