package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateProductRatingsPage;

public class CreateProductRatingsSteps {
    @Steps
    CreateProductRatingsPage newRating;

    @Given("user set endpoint Auth")
    public void setEndpointAuth() {
        newRating.SetEndpointAuth();
    }

    @When("user send endpoint Auth")
    public void sendEndpointAuth() {
        newRating.SendEndpointAuth();
    }

    @When("user set endpoint for create new rating products")
    public void setEndpointCreateRatingProducts() {
        newRating.setEndpointRatings();
    }

    @And("user send request for create new rating product")
    public void sendRequestForCreateRatingProduct() {
        newRating.sendEndpointCreateRatings();
    }

    @Then("user has response code {int}")
    public void getResponseCode(int arg0) {
        newRating.gainStatusCOde();
    }
}
