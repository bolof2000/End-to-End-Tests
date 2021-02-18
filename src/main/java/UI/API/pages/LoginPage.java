package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private final WebDriver driver;


    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginButton = By.cssSelector("#login button");
    private final By invalidLogin = By.id("flash-messages");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public SecureAreaPage setLoginCredentials(String enterUsername, String enterPassword){

        driver.findElement(username).sendKeys(enterUsername);
        driver.findElement(password).sendKeys(enterPassword);
        driver.findElement(loginButton).click();

        return new SecureAreaPage(driver);
    }

    public String invalidLogin(){
        return driver.findElement(invalidLogin).getText();
    }

}
