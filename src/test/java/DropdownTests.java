import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption(){

        var  dropdownPage= homePage.clickDropDown();

        String option =  "Option 1";
        dropdownPage.selectFromDropdown(option);
       var allOptions =  dropdownPage.getAllElementsInDropDown();
       Assert.assertEquals(allOptions.size(),1,"Incorrect number of selections");
       Assert.assertTrue(allOptions.contains(option),"Option not selected");




    }
}
