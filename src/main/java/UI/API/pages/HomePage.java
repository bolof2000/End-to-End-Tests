package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //Todo Define all home pages elements here and methods to interact with each elements
    private By formAuthentication =By.linkText("Form Authentication");
    private By dropDown = By.linkText("Dropdown");
    private By alertLink = By.linkText("JavaScript Alerts");
    private By clickUploadLink = By.linkText("File Upload");
    private By dynamicLoadingObject = By.linkText("Dynamic Loading");
    private By largeDeepDomObject = By.linkText("Large & Deep DOM");
    private By keyPress = By.linkText("Key presses");

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
    public AlertPage clickAlertButton(){
        driver.findElement(alertLink).click();
        return new AlertPage(driver);
    }
    public FileUploadPage clickFileUploadLink(){
         driver.findElement(clickUploadLink).click();
         return new FileUploadPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingObject(){
        driver.findElement(dynamicLoadingObject).click();
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDomPage clickLargeDeepDomObject(){
        driver.findElement(largeDeepDomObject).click();
        return new LargeDeepDomPage(driver);
    }
    public KeyPressPage clickKeyPress(){
        driver.findElement(keyPress).click();
        return  new KeyPressPage(driver);    }










}
