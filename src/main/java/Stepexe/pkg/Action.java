package Stepexe.pkg;

import Basepkg.Parentclass;
import Pages.Homepage;
import Pages.Rentpage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public  class Action extends Parentclass{


public void i_am_on_the_homwpage(){

    driver.get("https://www.zoopla.co.uk/");


        }


public void i_click_To_Rent() {

    driver.findElement(By.xpath("//*[@id=\"mn-rent\"]/a")).click();

}




public void enter_address() {

    driver.findElement(By.id("search-input-location")).sendKeys("oxfordshire");

    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
}



public void enter_max_price() {

        new Select(driver.findElement(By.id("rent_price_max_per_month"))).selectByVisibleText("£100 pcm");

        }


public void enter_min_price() {
    new Select(driver.findElement(By.id("rent_price_min_per_month"))).selectByVisibleText("£100 pcm");

        }


public void enter_Property_type(){
    new Select(driver.findElement(By.id("property_type"))).selectByVisibleText("Flats");

        }


public void enter_Bedrooms() {
    new Select(driver.findElement(By.id("beds_min"))).selectByVisibleText("1+");

        }

public void click_on_search(){

    driver.findElement(By.id("search-submit")).submit();

        }


public void validate_UK_property_to_rent_search() {
        String t =driver.getTitle();
        System.out.println(t);

        }
        }


