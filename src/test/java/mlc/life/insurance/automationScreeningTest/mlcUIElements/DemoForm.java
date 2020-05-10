package mlc.life.insurance.automationScreeningTest.mlcUIElements;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class DemoForm extends UIInteractionSteps {

	@Step
	public void enterDemoFormData(String name, String email, String phone) {
		$(MLCUIForm.DEMO_FORM_NAME).clear();
		$(MLCUIForm.DEMO_FORM_NAME).type(name);
		$(MLCUIForm.DEMO_FORM_EMAIL).clear();
		$(MLCUIForm.DEMO_FORM_EMAIL).type(email);
		$(MLCUIForm.DEMO_FORM_PHONE).clear();
		$(MLCUIForm.DEMO_FORM_PHONE).type(phone);
	}
}
