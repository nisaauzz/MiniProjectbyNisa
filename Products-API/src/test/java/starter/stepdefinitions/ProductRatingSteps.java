package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductRatingPage;

public class ProductRatingSteps {
    @Steps
    ProductRatingPage ratingProduct;
    @Given("user has endpoint get product rating api")
    public void userHasEndpointGetProductRatingApi() {
        ratingProduct.getApiEndpoint();
    }

    @When("user get product rating by id")
    public void userGetProductRatingById() {
        ratingProduct.sendGetRatingHttpRequest();
    }

    @Then("user get product rating status code {int}")
    public void userGetProductRatingStatusCode(int arg0) {
        ratingProduct.validateGetResponseCode200();
    }
}
