package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CategoryByIdPage {
    public String categorybyID = "https://altashop-api.fly.dev/api/categories";

    public String category = "https://altashop-api.fly.dev/api/categories";

    @Step
    public String setEndpointCategory(){
        return categorybyID + "/12568";
    }

    @Step
    public void sendEndpointCategory(){
        SerenityRest.given().get(setEndpointCategory());
    }

    @Step
    public void getResponse(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public String setEndpointAllCategories() {
        return category;
    }


    public void sendEndpointAllCategories() {
        SerenityRest.given().get(setEndpointAllCategories());
    }
}
