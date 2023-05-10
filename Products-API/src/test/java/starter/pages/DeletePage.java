package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePage {
    protected static String email="nisauzz@gmail.com";
    protected static String password="nisa";
    public String token ="";
    public String endpointAuth = "https://altashop-api.fly.dev/api";

    @Step
    public String setEndpointAuth(){
        return endpointAuth + "/auth/login";
    }

    @Step
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step
    public String setEndpointProduct() {
        return endpointAuth + "/products/11670";
    }

    @Step
    public void sendReqDeleteProduct() {
        SerenityRest.given().header("Authorization", "Bearer " + token).delete(setEndpointProduct());    }

    @Step
    public void validateHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
