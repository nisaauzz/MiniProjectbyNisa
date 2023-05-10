package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeletePage;

public class Delete {

    @Steps
    DeletePage deleteCategory;
    @Given("user set endpoint auth")
    public void setEndpointAuth() {
        deleteCategory.setEndpointAuth();
    }

    @When("user send endpoint auth")
    public void sendEndpointAuth() {
        deleteCategory.sendEndpointAuth();
    }

    @When("user set endpoint product category")
    public void setEndpointProduct() {
        deleteCategory.setEndpointCategories();
    }

    @And("user send request for delete product category")
    public void userSendRequestForDeleteProduct() {
        deleteCategory.sendReqDeleteCategories();
    }

    @Then("user see HTTP Response code {int}")
    public void validateHTTPResponseCode(int arg0) {
        deleteCategory.validateHTTPResponseCode();
    }
}
