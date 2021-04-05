package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DynamicExample1Page {
    private WebDriver driver;
    private By startElement = By.cssSelector("#start button");
    private By loadingElement = By.id("loading");
    private By helloWorldElement = By.id("finish");
   // WebDriverWait wait;

    public DynamicExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startElement).click();
        WebDriverWait wait  = new WebDriverWait(driver,5);
       // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingElement)));
        wait.until((ExpectedConditions.visibilityOf(driver.findElement(helloWorldElement))));
        //wait.until((ExpectedConditions.))
    }

    public String getHelloText(){
       return driver.findElement(helloWorldElement).getText();

    }
}
