package mlc.life.insurance.automationScreeningTest.stepDefinition;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
import mlc.life.insurance.automationScreeningTest.mlcUIElements.DemoForm;
import mlc.life.insurance.automationScreeningTest.mlcUIElements.NavigatingMLCUI;
import mlc.life.insurance.automationScreeningTest.mlcUIElements.Search;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class Exercise1StepDefinition {

	@Steps
	NavigatingMLCUI navigatingMLCUI;

	@Steps
	Search search;

	@Steps
	DemoForm demoForm;

	@Given("^User navigates to MLC homepage \"([^\"]*)\"$")
	public void navigatetoMLCHome(String url) {
		navigatingMLCUI.isOnHomePage(url);
	}

	@When("^User search for keyword \"([^\"]*)\"$")
	public void search_for(String keyword) {
		search.searchkeyword(keyword);
	}

	@And("^Click on the first result from result list$")
	public void clicnkOnFirstResult() {
		navigatingMLCUI.clickOnFirstSearchResult();
	}

	@Then("^Search page is displayed with navigation pane on the top as \"([^\"]*)\"$")
	public void verifyNavigationText(String breadCrumbs) {
		List<String> lifeViewNavigationTitlesList = new ArrayList<String>();
		lifeViewNavigationTitlesList = navigatingMLCUI.getlifeViewNavigationTitlesList();
		for (int i = 0; i < lifeViewNavigationTitlesList.size(); i++) {
			assertThat(breadCrumbs).containsIgnoringCase(lifeViewNavigationTitlesList.get(i).trim());
		}
	}

	@Then("^User Clicks on request a demo button$")
	public void clicnkOnRequestDemoButton() {
		navigatingMLCUI.clickOnDemoButton();
	}

	@And("^Enter relevant data in the form as name \"([^\"]*)\" email \"([^\"]*)\" and phone number as \"([^\"]*)\"$")
	public void enterFormData(String name, String email, String phone) {
		demoForm.enterDemoFormData(name, email, phone);
	}
}
