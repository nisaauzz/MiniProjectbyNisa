package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class AllProductPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    public String InvalidEndpoint = "https://altashop-api.fly.dev/api/product";

    @Step
    public String setByIDApiEndpoint(){
        return endpoint + "/11320";
    }


    @Step
    public String setApiEndpoint(){
        return endpoint;
    }

    @Step
    public String setInvalidApiEndpoint(){
        return InvalidEndpoint;
    }

    @Step
    public void sendApiEndpoint(){
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public void sendGetDetailById() {
        SerenityRest.given().get(setByIDApiEndpoint());
    }

    @Step
    public void SendGetHttpRequest() {
        SerenityRest.given().get(setInvalidApiEndpoint());
    }
    @Step
    public void getResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
