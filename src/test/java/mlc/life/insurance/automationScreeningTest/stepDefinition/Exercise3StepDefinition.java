package mlc.life.insurance.automationScreeningTest.stepDefinition;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mlc.life.insurance.automationScreeningTest.apiRequestResponse.APIConstants;
import mlc.life.insurance.automationScreeningTest.apiRequestResponse.APIRequest;
import mlc.life.insurance.automationScreeningTest.apiRequestResponse.APIResponse;
import net.thucydides.core.annotations.Steps;

public class Exercise3StepDefinition {
	public static String apiEndPointURL;
	List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	public List <String> prices= new ArrayList<String>();

	@Steps
	APIRequest apiRequest;
	
	@Steps
	APIResponse apiResponse;

	@Given("^The API is up and running with endpoint \"([^\"]*)\"$")
	public void setEndPointURL(String url) {
		apiEndPointURL = url;
	}
	
	@When("^User sends request message to check price for sending a package of different weights to different countries as per below data$")
	public void sendRequest(DataTable dt) {
		list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			String countryCode ;
			if(list.get(i).get(APIConstants.COUNTRY).equalsIgnoreCase(APIConstants.INDIA)) {
				countryCode = APIConstants.COUNTRY_CODE_INDIA;
			}else if(list.get(i).get(APIConstants.COUNTRY).equalsIgnoreCase("APIConstants.UNITED_KINGDOM")) {
				countryCode = APIConstants.COUNTRY_CODE_UK;
			}else
				countryCode = APIConstants.COUNTRY_CODE_US;
			apiRequest.priceRequest(list.get(i).get(APIConstants.WEIGHT), countryCode, apiEndPointURL);
			restAssuredThat(response -> response.statusCode(200));
	        List<Map<String, String>> actualResponse = apiResponse.returned();
	        for(int j=0; j<actualResponse.size(); j++) {
	        	if(actualResponse.get(j).get(APIConstants.NAME).equalsIgnoreCase(APIConstants.STANDARD)) {
	        		prices.add(actualResponse.get(j).get(APIConstants.PRICE));
	        		break;
	        	}
	        }
		}
	}
	
	@Then("^User recieves standard delivery price as part of response message$")
	public void parseResponse() {
       for(int i=0; i<prices.size(); i++) {
    	   System.out.println("****************************************  Price for " + list.get(i).get(APIConstants.COUNTRY) + " : " + prices.get(i) + " ***************************");
       }
	}
}
