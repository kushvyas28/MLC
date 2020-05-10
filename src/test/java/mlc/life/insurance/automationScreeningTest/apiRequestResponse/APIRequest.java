package mlc.life.insurance.automationScreeningTest.apiRequestResponse;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class APIRequest {

    @Step
    public void priceRequest(String weight, String countryCode, String url) {
    	SerenityRest.given()
    	.queryParams(APIConstants.COUNTRY_CODE, countryCode, APIConstants.WEIGHT, weight)
        .contentType(APIConstants.APPLICATION_JSON)
        .headers(APIConstants.USER_AGENT, APIConstants.CURL, APIConstants.AUTH_KEY, APIConstants.ACCESS_KEY)
        .when()
        .get(url);
    }
}
