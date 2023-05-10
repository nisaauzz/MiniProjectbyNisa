package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateCategoryPage;

public class CreateCategorySteps {
    @Steps
    CreateCategoryPage product;

    @Given("user has endpoint product category")
    public void userHasEndpointPostNewProduct() {
        product.setPostEndpoint();
    }

    @When("user send request to endpoint product category")
    public void userSendPostNewProduct() {
        product.sendPostHttpRequest();
    }

    @Then("user see status code {int}")
    public void userSeeStatusCode(int arg0) {
        product.validateHttpResponseCode200();
    }

}
