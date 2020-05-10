package mlc.life.insurance.automationScreeningTest.stepDefinition;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mlc.life.insurance.automationScreeningTest.atoUIElements.ATOConstants;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import mlc.life.insurance.automationScreeningTest.atoUIElements.NavigatingATOUI;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class Exercise2StepDefinition {
	public static String atoURL;
	public List <String> actualTaxValues= new ArrayList<String>();

	@Steps
	NavigatingATOUI navigatingATOUI;

	@Given("^User navigates to ATO page \"([^\"]*)\"$")
	public void navigatetoATOPage(String url) {
		atoURL = url;
		navigatingATOUI.isOnATOPage(url);
	}
	
	@When("^User select assessment year, income and residency status as per below data$")
	public void enterATODetails(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			navigatingATOUI.enterATODetails(list.get(i).get(ATOConstants.YEAR), list.get(i).get(ATOConstants.INCOME), list.get(i).get(ATOConstants.RESIDENCY), list.get(i).get(ATOConstants.TAXABLE_MONTHS));
			actualTaxValues.add(navigatingATOUI.readTaxValue());
			navigatingATOUI.isOnATOPage(atoURL);
		}
	}
	
	@Then("^User should be displayed with expected tax values$")
	public void verifyCalculatedTax(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			assertThat(list.get(i).get(ATOConstants.EXPECTED_AMOUNT).trim()).containsIgnoringCase(actualTaxValues.get(i).trim());
		}
	}
}
