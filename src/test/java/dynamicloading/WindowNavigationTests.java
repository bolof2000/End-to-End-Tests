package dynamicloading;

import base.BaseTest;
import org.testng.annotations.Test;

public class WindowNavigationTests extends BaseTest {


    @Test
    public void testNavigation(){

        homePage.clickDynamicLoadingObject().clickExample1Element();
        getWindowsManager().goBack();
        getWindowsManager().refreshPage();
        getWindowsManager().goForward();
        getWindowsManager().goToUrl("https://google.com");
    }
}
