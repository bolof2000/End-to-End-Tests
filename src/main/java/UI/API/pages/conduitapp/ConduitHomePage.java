package UI.API.pages.conduitapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConduitHomePage {
    private WebDriver driver;

    public ConduitHomePage(WebDriver driver){
        this.driver = driver;
    }
    private By signUpLink = new By.ByLinkText("Sign Up");

    public ConduitSignUpPage clickSignUp(){
        driver.findElement(signUpLink).click();
        return  new ConduitSignUpPage(driver);
    }
}
