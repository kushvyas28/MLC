package mlc.life.insurance.automationScreeningTest.mlcUIElements;

import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class LifeViewNavigationTitles extends UIInteractionSteps {
    public List<String> titles() {
        return findAll(MLCUIForm.NAVIGATION_TITLES)
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());	
    }
}
