package mlc.life.insurance.automationScreeningTest.mlcUIElements;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Step;

public class NavigatingMLCUI {

    MLCHomePage mlcHomePage;
    CurrentPageMLC currentPageMLC;
    LifeViewNavigationTitles lifeViewNavigationTitles;

    @Step
    public void isOnHomePage(String url) {
    	mlcHomePage.openUrl(url);
    }
    
    @Step
    public void clickOnFirstSearchResult() {
    	currentPageMLC.$(MLCUIForm.FIRSTSEARCHRESULTLINK).click();
    }
    
    @Step
    public List<String> getlifeViewNavigationTitlesList() {
    	List<String> lifeViewNavigationTitlesList= new ArrayList<String>();  
    	lifeViewNavigationTitlesList = lifeViewNavigationTitles.titles();
    	return lifeViewNavigationTitlesList;
    }
    
    @Step
    public void clickOnDemoButton() {
    	currentPageMLC.$(MLCUIForm.DEMO_BUTTON).click();
    }
    
}
