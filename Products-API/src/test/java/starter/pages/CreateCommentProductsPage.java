package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateCommentProductsPage {
    protected static String email="nisauzz@gmail.com";
    protected static String password="nisa";
    public String token ="";
    public String endpointAuth = "https://altashop-api.fly.dev/api";

    @Step
    public String PosessesEndpointAuth(){
        return endpointAuth + "/auth/login";
    }

    @Step
    public void ClarifyEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(PosessesEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step
    public String setEndpointComment() {
        return endpointAuth + "/products/11314/comments";
    }

    @Step
    public void sendEndpointComment() {
        String content = "komentar product";

        String body = "{\n" +
                "    \"content\":" + content + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+token).body(reqBody.toString()).post(setEndpointComment());
    }

    @Step
    public void gainHTPPcode() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
