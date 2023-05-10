package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewProductPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    public String invalidEndpoint = "https://altashop-api.fly.dev/api/product";

    @Step
    public String setPostEndpoint(){
        return endpoint;
    }

    @Step
    public void sendPostHttpRequest(){
        String name = "Product";
        String description = "ini deskripsi produk";

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

    @Step
    public String setInvalidEndpoint() {
        return  invalidEndpoint;
    }
    @Step
    public void sendInvalidEndpoint() {
        String name = "Product";
        String description = "ini deskripsi produk";

        String body = "{\n" +
                "    \"name\":" + name + ",\n" +
                "    \"description\":" + description + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setInvalidEndpoint());
    }

    public void errorResponse()  {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void InvalidEndpoint() {
        String name = "Product";
        String description = "ini deskripsi produk";

        String body = "{\n" +
                "    \"name\":" + name + ",\n" +
                "    \"description\":" + description + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setInvalidEndpoint());
    }
}


