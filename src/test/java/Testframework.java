import Basepkg.Parentclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Testframework {

    WebDriver driver;

    Parentclass pf=new Parentclass();

    @Before

    public  void open() {
        pf.open();

    }


    @After
    public void end(){
        pf.close();


    }


}
