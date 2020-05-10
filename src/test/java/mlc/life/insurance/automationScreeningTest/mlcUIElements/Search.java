package mlc.life.insurance.automationScreeningTest.mlcUIElements;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class Search extends UIInteractionSteps {

	@Step
	public void searchkeyword(String keyword) {
		$(MLCUIForm.SEARCH_TOGGLE).waitUntilEnabled().click();
		$(MLCUIForm.SEARCH_FIELD).clear();
		$(MLCUIForm.SEARCH_FIELD).type(keyword);
		$(MLCUIForm.SEARCH_BUTTON).click();
	}
}
