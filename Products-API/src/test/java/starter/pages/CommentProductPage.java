package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class CommentProductPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    @Step
    public String sendEndpointGetProductComments() {
        return endpoint + "/11314" + "/comments";
    }

    @Step
    public void getProductComments(){
        SerenityRest.given().get(sendEndpointGetProductComments());
    }

    public void validateProductCommentResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
