package steps;

import cucumber.api.java.en.*; //importar las anotaciones
import pages.GooglePages;

public class GoogleSteps {
    //crear definiciones de steps

    GooglePages googlePages = new GooglePages(); //instancia de la clase GooglePages

    @Given("^I am in the google page$") 
    public void navigateToGoogle()  {       
        googlePages.navigateToGoogle("https://www.google.com/"); //usando la instancia de la clase GooglePages, heredamos los metodos de la clase BasePage
    }

    @When("^I search for Selenium$") 
    public void searchToGoogle()  {       
        
    }

    @And("^click on the search button$") 
    public void clickToGoogle()  {       
        
    }

    @Then("^I should see the results for Selenium$") 
    public void resultsToGoogle()  {        
        
    }
}
