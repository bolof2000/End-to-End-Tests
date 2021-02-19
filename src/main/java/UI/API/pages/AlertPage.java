package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private WebDriver driver;
    private By alertObject =  By.xpath(".//button[text()='Click for JS Alert']");
    private By enterInputInPrompt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By alertResults = By.id("result");

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAlert(){
        driver.findElement(alertObject).click();



    }

    public void TriggerToEnterPrompt(){
        driver.findElement(enterInputInPrompt).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void rejectAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToDismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void enterTextIntoAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String alertresultsMethod(){
       return driver.findElement(alertResults).getText();
    }
}
