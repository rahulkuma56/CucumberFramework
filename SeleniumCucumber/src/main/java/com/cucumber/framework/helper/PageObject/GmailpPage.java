package com.cucumber.framework.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;

public class GmailpPage extends PageBase {

	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(GmailpPage.class);

	public GmailpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(how=How.XPATH,using="//input[@type='email']")
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	public WebElement password;
	
	@FindBy(how=How.ID,using="identifierNext")
	public WebElement nextBtn;
	
	@FindBy(how=How.ID,using="passwordNext")
	public WebElement passwordNext;
	
	/*////div[@aria-label="Account Information"]//div[@class="gb_3a"]/div
	@FindBy(how=How.XPATH,using="//input[@type='email']")
	public List WebElement accInfo;
*/
}
