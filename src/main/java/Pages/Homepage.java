package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage {
    WebDriver driver;

   @FindBy (linkText = "To rent")
    public WebElement torent;


   @FindBy(linkText = "UK Property to rent")
    public  WebElement ukprop;


   public  Homepage (WebDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
}
