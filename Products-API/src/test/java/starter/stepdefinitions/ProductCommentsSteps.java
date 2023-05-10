package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CommentProductPage;

public class ProductCommentsSteps {
    @Steps
    CommentProductPage commentProduct;
    @Given("user send endpoint product comments")
    public void sendEndpointGetProductComments() {
        commentProduct.sendEndpointGetProductComments();
    }

    @When("user get product comments")
    public void getProductComments() {
        commentProduct.getProductComments();
    }

    @Then("user get product comments status code {int}")
    public void GetProductCommentsStatusCode(int arg0) {
        commentProduct.validateProductCommentResponseCode200();
    }
}
