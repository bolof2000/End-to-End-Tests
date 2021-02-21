package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LargeDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");
    public LargeDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }
}
