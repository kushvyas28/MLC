package mlc.life.insurance.automationScreeningTest.apiRequestResponse;

import java.util.List;
import java.util.Map;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class APIResponse {
	@Step
    public List<Map<String, String>> returned() {
		return SerenityRest.lastResponse().getBody().jsonPath().getList(APIConstants.JSON_PATH);
    }
}
