package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeletePage;

public class Delete {

    @Steps
    DeletePage deleteProduct;
    @Given("user set endpoint auth")
    public void setEndpointAuth() {
        deleteProduct.setEndpointAuth();
    }

    @When("user send endpoint auth")
    public void sendEndpointAuth() {
        deleteProduct.sendEndpointAuth();
    }

    @When("user set endpoint product")
    public void setEndpointProduct() {
        deleteProduct.setEndpointProduct();
    }

    @And("user send request for delete product")
    public void userSendRequestForDeleteProduct() {
        deleteProduct.sendReqDeleteProduct();
    }

    @Then("user see HTTP Response code {int}")
    public void validateHTTPResponseCode(int arg0) {
        deleteProduct.validateHTTPResponseCode();
    }
}
