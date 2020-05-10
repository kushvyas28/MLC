package mlc.life.insurance.automationScreeningTest.mlcUIElements;

import org.openqa.selenium.By;

class MLCUIForm {
	static By SEARCH_TOGGLE = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/nav[2]/button[1]");
    static By SEARCH_FIELD = By.cssSelector("#q");
    static By SEARCH_BUTTON = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]/span[2]/*");
    static By FIRSTSEARCHRESULTLINK = By.xpath("//li[1]//div[1]//a[1]//div[1]//h2[1]");
    static By NAVIGATION_TITLES = By.xpath("//div[@class='breadcrumbs']//ul");
    static By DEMO_BUTTON = By.xpath("//span[@class='cta']");
    static By DEMO_FORM_NAME = By.xpath("//input[@id='wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_0__Value']");
    static By DEMO_FORM_EMAIL = By.xpath("//input[@id='wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_2__Value']");
    static By DEMO_FORM_PHONE = By.xpath("//input[@id='wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_3__Value']");
}
