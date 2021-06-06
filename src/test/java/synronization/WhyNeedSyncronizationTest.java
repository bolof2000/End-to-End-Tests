package synronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class WhyNeedSyncronizationTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
    }


    @Test
    public void canNavigateAboutFromExpandingSectionLink(){
        driver.get("https://eviltester.github.io/simpletodolist/adminlogin.html");
        final WebElement section = driver.findElement(By.cssSelector("section.condense"));
        section.click();

        final WebElement sectionLink = driver.findElement(By.cssSelector("a#aboutlink"));
        sectionLink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about.html"));

    }

    @Test
    public void handleCollapseWithWebDriverWait(){

        driver.get("https://eviltester.github.io/synchole/collapseable.html");
        final WebElement section = driver.findElement(By.cssSelector("section.condense"));
        section.click();
        final By linkToClick = By.cssSelector("a#aboutlink");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        final WebElement link = driver.findElement(linkToClick);
        link.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about.html"));
    }

    @Test
    public void canClickOnSecondButtonsWithWebDriverWait(){
        driver.get("https://eviltester.github.io/synchole/buttons.html");

        WebElement button;
        By locator = By.id("button00");
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(locator));
        button = driver.findElement(locator);
        button.click();

         locator = By.id("button01");
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(locator));
        button = driver.findElement(locator);
        button.click();

        locator = By.id("button02");
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(locator));
        button = driver.findElement(locator);
        button.click();


        locator = By.id("button03");
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(locator));
        button = driver.findElement(locator);
        button.click();

        Assert.assertEquals("All Buttons Clicked",driver.findElement(By.id("buttonmessage")).getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
