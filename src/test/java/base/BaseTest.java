package base;

import UI.API.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    //Todo Create setup to initialize common funtions to all tests
    //Todo Create teadoown

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Volumes/TECH/API-development/End-to-End/src/main/utilities/chromedriver");
        driver = new ChromeDriver();
       launchUrl();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @BeforeMethod
    public void launchUrl(){
        driver.get("https://the-internet.herokuapp.com");
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

}

