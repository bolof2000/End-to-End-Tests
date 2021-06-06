package strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {
    private WebDriver driver;
    private final By buyNowButton = By.id("buy");
    private final By orderNumber = By.id("ordernumber");

    public Order(WebDriver driver){
        this.driver = driver;
    }

    public String placeOrder(){
        driver.findElement(buyNowButton).click();
        return driver.findElement(orderNumber).getText();
    }
}
