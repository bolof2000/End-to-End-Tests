package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1Element = By.linkText("Example 1: Element on page that is hidden");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicExample1Page clickExample1Element(){
        driver.findElement(example1Element).click();

        return new DynamicExample1Page(driver);

    }


}
