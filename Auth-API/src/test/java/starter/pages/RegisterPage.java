package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class RegisterPage {
    public String register = "https://altashop-api.fly.dev/api/auth/register";

    @Step
    public String setEndpointRegister(){
        return register;
    }

    @Step
    public void sendEndpointRegister(){
        String email = "nisauzz@gmail.com2";
        String password = "nisa";
        String fullname = "Nisa' Uzzulfa";

        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "    \"fullname\":" + fullname + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setEndpointRegister());
    }
    @Step
    public void responseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
