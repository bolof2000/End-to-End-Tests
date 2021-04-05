package UI.API.pages.conduitapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConduitSignUpPage {
    private WebDriver driver;
    public ConduitSignUpPage(WebDriver driver){
        this.driver = driver;
    }
    private By usernamelocator = By.xpath("//input[@placeholder='Username']");
    private By emailLocator = By.xpath("//input[@placeholder='Email']");
    private By passwordLocator = By.xpath("//input[@placeholder='Password']");
    private By signUpLocator = By.xpath("//button[@class='btn btn-lg btn-primary pull-xs-right']");
    private By HaveAnAccountLocator = By.linkText("Have an account?");

    public ConduitFeedHomePage RegisterAccount(String username,String email,String password){
        driver.findElement(usernamelocator).sendKeys(username);
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(signUpLocator).click();
        return new ConduitFeedHomePage(driver);
    }
}
