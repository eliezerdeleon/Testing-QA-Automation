package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

GooglePage google = new GooglePage();
    
@Given("^I am on the Google search page$")
public void navigateToGoogle(){
google.navigateToGoogle();
google.clickGoogleSearch();
}

@When("^I enter a search criteria$")
public void searchSomething(){

}

@And("^click on the search button$")
public void clickOnSearch(){

}

@Then("^the results match the criteria$")
public void obtainResults(){

}

}
