package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rentpage {

    WebDriver driver;
    @FindBy(id = "search-input-location")
    public WebElement firstbox;

    @FindBy(id = "rent_price_min_per_month")
    public  WebElement minprice;

    @FindBy(id="rent_price_max_per_month")
    public  WebElement maxprice;

    @FindBy(id = "property_type")
    public  WebElement PROPTYPE;

    @FindBy(id = "beds_min")
    public  WebElement bedmin;


    @FindBy(id = "search-submit")
    public  WebElement searchbtn;


    public Rentpage (WebDriver driver)
    {

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
