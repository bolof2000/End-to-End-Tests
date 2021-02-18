package UI.API.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
      findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getAllElementsInDropDown(){
        List<String > ele = new ArrayList<>();
       List<WebElement> alloptions = findDropdownElement().getAllSelectedOptions();
       for(WebElement element: alloptions){
           ele.add(element.getText());
       }
       return ele;
    }

    public Select findDropdownElement(){

        return new Select(driver.findElement(dropdown));
    }
}
