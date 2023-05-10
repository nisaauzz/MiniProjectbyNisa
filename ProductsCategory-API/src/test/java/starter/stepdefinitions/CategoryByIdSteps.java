package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.checkerframework.checker.units.qual.C;
import starter.pages.CategoryByIdPage;

public class CategoryByIdSteps {
    @Steps
    CategoryByIdPage categoryID;

    @Steps
    CategoryByIdPage categoryAll;
    @Given("user has endpoint category product")
    public void userHasEndpointCategoryProduct() {
        categoryID.setEndpointCategory();
    }

    @When("user send request to endpoint category product")
    public void userSendRequestToEndpointCategoryProduct() {
        categoryID.sendEndpointCategory();
    }

    @Then("user get response with status code {int}")
    public void userGetResponseWithStatusCode(int arg0) {
        categoryID.getResponse();
    }

    @Given("user has endpoint product all categories")
    public void userHasEndpointProductAllCategories() {
        categoryAll.setEndpointAllCategories();
    }

    @When("user send request to endpoint product all categories")
    public void userSendRequestToEndpointProductAllCategories() {
        categoryAll.sendEndpointAllCategories();
    }
}
