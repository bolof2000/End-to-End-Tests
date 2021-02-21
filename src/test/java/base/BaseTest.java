package base;

import UI.API.pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.EventReporter;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    //Todo Create setup to initialize common funtions to all tests
    //Todo Create teadoown

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Volumes/TECH/API-development/End-to-End/src/main/utilities/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
       launchUrl();
        driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @BeforeMethod
    public void launchUrl(){
        driver.get("https://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    @AfterMethod
    public void recordFailure(ITestResult result ) throws IOException {
        if(ITestResult.FAILURE == result.getStatus()){

            var camera =  (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            //System.out.println("Screenshot Taken: " + screenshot.getAbsolutePath());
            Files.move(screenshot,new File("/Volumes/TECH/API-development/End-to-End/src/main/utilities/screenshots/failedtests/" +result.getName()+ ".png"));

        }}

        @AfterMethod
        public void recordSuccess(ITestResult result ) throws IOException {
            if(ITestResult.SUCCESS == result.getStatus()){

                var camera =  (TakesScreenshot)driver;
                File screenshot = camera.getScreenshotAs(OutputType.FILE);
               // System.out.println("Screenshot Taken: " + screenshot.getAbsolutePath());
                Files.move(screenshot,new File("/Volumes/TECH/API-development/End-to-End/src/main/utilities/screenshots/passedtests/" +result.getName()+ ".png"));

            }
    }

    public WindowsManager getWindowsManager(){
        return new WindowsManager(driver);
    }

}

