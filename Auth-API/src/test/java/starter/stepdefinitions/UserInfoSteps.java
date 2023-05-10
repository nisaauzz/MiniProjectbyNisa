package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.UserInfoPage;

public class UserInfoSteps {

    @Steps
    UserInfoPage info;
    @Given("user have endpoint auth")
    public void userHaveEndpointAuth() {
        info.setEndpointAuth();
    }

    @When("user send endpoint Auth")
    public void userSendEndpointAuth() {
        info.sendEnpointAuth();
    }

    @When("user has endpoint to get user information")
    public void userHasEndpointToGetUserInformation() {
        info.setEndpointUserInfo();
    }

    @And("user get user information")
    public void userGetUserInformation() {
        info.sendEnpointUserInfo();
    }

    @Then("user get user information status code {int}")
    public void userGetUserInformationStatusCode(int arg0) {
        info.responseCode();
    }
}
