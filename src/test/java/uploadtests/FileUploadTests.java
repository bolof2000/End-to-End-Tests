package uploadtests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadLink();
        uploadPage.clickChooseFileUpload("/Volumes/TECH/API-development/End-to-End/src/main/utilities/event.ics");
        uploadPage.submitFileUpload();
        Assert.assertEquals(uploadPage.verifyUploadedFile(),"event.ics");
    }
}
