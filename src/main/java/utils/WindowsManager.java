package utils;

import org.openqa.selenium.WebDriver;

public class WindowsManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowsManager(WebDriver driver){
        this.driver = driver;
        navigate= driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goToUrl(String url){
        navigate.to(url);
    }

}
