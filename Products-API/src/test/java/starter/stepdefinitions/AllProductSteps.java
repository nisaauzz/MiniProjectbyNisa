package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AllProductPage;

public class AllProductSteps {
    @Steps
    AllProductPage Product;

    @Given("user has endpoint product")
    public void HasEndpoint() {
        Product.setApiEndpoint();
    }

    @When("user get all detail product")
    public void EndpointAllDetailProduct() {
        Product.sendApiEndpoint();
    }

    @Then("user get product status code {int}")
    public void ProductStatusCode(int arg0) {
        Product.validateHttpResponseCode200();
    }

    @Given("user has endpoint get api")
    public void HasEndpointGetApi() {
        Product.setByIDApiEndpoint();
    }

    @When("user get detail by id")
    public void DetailById() {
        Product.sendGetDetailById();
    }

    @Given("user has invalid endpoint product")
    public void HasInvalidEndpoint() {
        Product.setInvalidApiEndpoint();
    }

    @When("user not found get detail product")
    public void NotFoundGetDetailProduct() {
        Product.SendGetHttpRequest();
    }

    @Then("user get code status {int}")
    public void GetCodeStatus(int arg0) {
        Product.getResponseCode404();
    }
}
