package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //Todo Define all home pages elements here and methods to interact with each elements
    private By formAuthentication =By.linkText("Form Authentication");
    private By dropDown = By.linkText("Dropdown");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        driver.findElement(dropDown).click();
        return new DropdownPage(driver);
    }








}
