package dynamicloading;

import UI.API.pages.DynamicExample1Page;
import UI.API.pages.DynamicLoadingPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DyanmicloadingTests extends BaseTest {

    @Test
    public void testHelloText(){

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingObject();
        DynamicExample1Page dynamicExample1Page = dynamicLoadingPage.clickExample1Element();
        dynamicExample1Page.clickStart();
       String helloText = dynamicExample1Page.getHelloText();
        Assert.assertEquals(helloText,"Hello World!");
    }
}

