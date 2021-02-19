package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    private By chooseFileUpload = By.id("file-upload");
    private By uploadFeile = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public void submitFileUpload(){
        driver.findElement(uploadFeile).click();
    }
    public void clickChooseFileUpload(String s){
        driver.findElement(chooseFileUpload).sendKeys(s);
        submitFileUpload();
    }

    public String verifyUploadedFile(){
        return driver.findElement(uploadedFile).getText();
    }

}
