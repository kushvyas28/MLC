package mlc.life.insurance.automationScreeningTest.atoUIElements;

import org.openqa.selenium.By;

class ATOUIForm {
	static By ASSESSMENT_YEAR = By.xpath("//select[@id='ddl-financialYear']");
	static By INCOME = By.xpath("//input[@id='texttaxIncomeAmt']");
	static By RESIDENT = By.xpath("//span[@id='vrb-resident-span-0']");
	static By NON_RESIDENT = By.xpath("//span[@id='vrb-resident-span-1']");
	static By PART_RESIDENT = By.xpath("//span[@id='vrb-resident-span-2']");
	static By PART_YEAR_MONTHS = By.xpath("//select[@id='ddl-residentPartYearMonths']");
	static By SUBMIT_BUTTON = By.xpath("//button[@id='bnav-n1-btn4']");
	static By TAX_CALCULATED = By.xpath("/html[1]/body[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/span[1]");
}
