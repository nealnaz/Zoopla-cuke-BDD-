package Step;

import Stepexe.pkg.Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class defenetion {


    Action  ac=new Action();


    @Given("^I am on the homwpage$")
    public void i_am_on_the_homwpage(){

        ac.i_am_on_the_homwpage();
    }

    @When("^i click To Rent$")
    public void i_click_To_Rent() {

        ac.i_click_To_Rent();
    }



    @When("^enter address$")
    public void enter_address() {
        ac.enter_address();
    }

    @When("^enter max price$")
    public void enter_max_price() {

        ac.enter_max_price();
    }

    @When("^enter min price$")
    public void enter_min_price() {
        ac.enter_min_price();
    }

    @When("^enter Property type$")
    public void enter_Property_type(){
        ac.enter_Property_type();
    }

    @When("^enter Bedrooms$")
    public void enter_Bedrooms() {
        ac.enter_Bedrooms();
    }

    @When("^click on search$")
    public void click_on_search(){

        ac.click_on_search();
    }

    @Then("^validate UK property to rent search$")
    public void validate_UK_property_to_rent_search() {
        ac.validate_UK_property_to_rent_search();

    }
    }


