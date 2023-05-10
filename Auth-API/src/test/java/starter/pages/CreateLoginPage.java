package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateLoginPage {
    public String loginEndpoint = "https://altashop-api.fly.dev/api/auth/login";

    @Step("I have endpoint post new user")
    public String setEndpointLogin(){
        return loginEndpoint;
    }

    @Step ("I send post new user")
    public void sendEndpointLogin(){
        String email = "nisauzz@gmail.com";
        String password = "nisa";

        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setEndpointLogin());
    }

    public void responseCodeStatus() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
