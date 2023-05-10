package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateNewProductPage;

public class CreateNewProductSteps {
    @Steps
    CreateNewProductPage product;

    @Given("user has endpoint post new product")
    public void userHasEndpointPostNewProduct() {
        product.setPostEndpoint();
    }

    @When("user send post new product")
    public void userSendPostNewProduct() {
        product.sendPostHttpRequest();
    }

    @Then("user see status code {int}")
    public void userSeeStatusCode(int arg0) {
        product.validateHttpResponseCode200();
    }

    @Given("user has invalid endpoint for create new product")
    public void userHasInvalidEndpointForCreateNewProduct() {
        product.setInvalidEndpoint();
    }

    @When("user send post invalid endpoint new product")
    public void userSendPostInvalidEndpointNewProduct() {
        product.sendInvalidEndpoint();
    }

    @Then("user see error message with status code {int}")
    public void userSeeErrorMessageWithStatusCode(int arg0) {
        product.errorResponse();
    }

    @When("user send request to invalid endpoint product")
    public void userSendRequestToInvalidEndpointProduct() {
        product.InvalidEndpoint();
    }
}
