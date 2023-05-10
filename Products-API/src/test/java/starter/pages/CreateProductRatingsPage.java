package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateProductRatingsPage {
    protected static String email="nisauzz@gmail.com";
    protected static String password="nisa";
    public String token ="";
    public String EndpointAuth = "https://altashop-api.fly.dev/api";

    @Step
    public String SetEndpointAuth(){
        return EndpointAuth + "/auth/login";
    }

    @Step
    public void SendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(SetEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step
    public String setEndpointRatings() {
        return EndpointAuth + "/products/11314/ratings";
    }

    @Step
    public void sendEndpointCreateRatings() {
        String count = "4";

        String body = "{\n" +
                "    \"count\":" + count + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+token).body(reqBody.toString()).post(setEndpointRatings());
    }

    @Step
    public void gainStatusCOde() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
