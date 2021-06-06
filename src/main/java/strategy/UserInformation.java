package strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInformation {

    private WebDriver driver;
    public UserInformation(WebDriver driver){
        this.driver = driver;
    }
    private final By firstName = By.id("fn");
    private final By lastName = By.id("lb");
    private final By email = By.id("email");

    public void enterLoginDetails(String fn,String ln,String emailAddress){
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(email).sendKeys(emailAddress);
    }
}
