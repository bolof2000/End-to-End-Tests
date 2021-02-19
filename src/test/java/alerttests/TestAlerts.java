package alerttests;

import UI.API.pages.AlertPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlerts extends BaseTest {


    @Test
    public void testSetInputInAlert(){
        AlertPage alertPage = homePage.clickAlertButton();
        String enterText = "bolofinde";
        alertPage.TriggerToEnterPrompt();
        alertPage.enterTextIntoAlert(enterText);
        alertPage.acceptAlert();
        Assert.assertTrue(alertPage.alertresultsMethod().contains(enterText),"the text is not found");

    }


}
