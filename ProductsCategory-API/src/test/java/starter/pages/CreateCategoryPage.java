package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateCategoryPage {
    public String endpointCategory = "https://altashop-api.fly.dev/api/categories";

    @Step
    public String setPostEndpoint(){
        return endpointCategory;
    }

    @Step
    public void sendPostHttpRequest(){
        String name = "nama produk";
        String description = "kategori produk";

        String body = "{\n" +
                "    \"name\":" + name + ",\n" +
                "    \"description\":" + description + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpoint());
    }

    @Step
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

}

