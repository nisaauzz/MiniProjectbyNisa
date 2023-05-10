package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class ProductRatingPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    @Step
    public String getApiEndpoint(){
        return endpoint + "/11027" + "/ratings";
    }

    @Step
    public void sendGetRatingHttpRequest(){
        SerenityRest.given().get(getApiEndpoint());
    }


    public void validateGetResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
