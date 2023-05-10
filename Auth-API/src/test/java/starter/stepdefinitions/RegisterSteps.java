package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage register;

    @Given("user has endpoint for create user register")
    public void userHasEndpointForCreateUserRegister() {
        register.setEndpointRegister();
    }

    @When("user send endpoint for create user register")
    public void userSendEndpointForCreateUserRegister() {
        register.sendEndpointRegister();
    }

    @Then("user get status code {int}")
    public void userGetStatusCode(int arg0) {
    register.responseCode();
    }
}
