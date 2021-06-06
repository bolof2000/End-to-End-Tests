package pagesObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement pass;

    @FindBy(css="#login button")
    public WebElement login;


}
