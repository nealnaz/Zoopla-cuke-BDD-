package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Parentclass {

   public static WebDriver driver;


    public  void open(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zubair\\Desktop\\NewAutomation\\chromedriver.exe");
        driver = new ChromeDriver();


    }



    public  void close(){
        driver.close();






    }

}

