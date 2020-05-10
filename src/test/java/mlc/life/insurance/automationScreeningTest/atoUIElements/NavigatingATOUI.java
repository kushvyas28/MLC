package mlc.life.insurance.automationScreeningTest.atoUIElements;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class NavigatingATOUI {

	ATOPage atoPage;
	CurrentPageATO currentPage;

	@Step
	public void isOnATOPage(String url) {
		atoPage.openUrl(url);
	}

	@Step
	public void enterATODetails(String year, String income, String residencyStatus, String taxableMonths) {
		//Selecting Assessment year
		WebElementFacade yearDropDown = currentPage.$(ATOUIForm.ASSESSMENT_YEAR);
		yearDropDown.selectByVisibleText(year);
		//Selecting Income
		currentPage.$(ATOUIForm.INCOME).type(income);
		//Selecting Residential status
		if (residencyStatus.equalsIgnoreCase("Resident for full year")) {
			currentPage.$(ATOUIForm.RESIDENT).click();
		} else if (residencyStatus.equalsIgnoreCase("Non-resident for full year")) {
			currentPage.$(ATOUIForm.NON_RESIDENT).click();
		} else {
			currentPage.$(ATOUIForm.PART_RESIDENT).click();
			WebElementFacade partYearMonths = currentPage.$(ATOUIForm.PART_YEAR_MONTHS);
			partYearMonths.selectByVisibleText(taxableMonths);
		}
		// submitting the page
		currentPage.$(ATOUIForm.SUBMIT_BUTTON).click();
	}
	
	@Step
	public String readTaxValue() {
		return currentPage.$(ATOUIForm.TAX_CALCULATED).getText();
	}

}
