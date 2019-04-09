package com.cucumber.framework.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.framework.helper.PageObject.GmailpPage;
import com.cucumber.framework.helper.PageObject.itemsbag.ItemsBag;
import com.cucumber.framework.helper.PageObject.userdetails.Userdetails;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@CucumberOptions(features = { "classpath:featurefile/gmail.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = { "pretty",
		"json:target/LaptopFeatureRunner.json" })
public class Gmail {
	private GmailpPage gPage;
	private ItemsBag bag;
	private Userdetails details;
	
	//@Given("^:I pass URL \"([^\"]*)\" in URL bar$")
	@Given("^:I am at the home page")
	public void enterURL() throws Throwable{
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		gPage = new GmailpPage(ObjectRepo.driver);
		System.out.println("**********************homepage"+gPage);
		ObjectRepo.data.put("GmailPage", gPage);
		
		
	}
	
	//@Then("^: I pass email ID\"([^\"]*)\"$")
	@Then("^: I pass email ID")
	public void enterEmailID() throws Exception {
		
		gPage = (GmailpPage) ObjectRepo.data.get("GmailPage");
		System.out.println("**********Data ***************"+ObjectRepo.data+"*****************GmailPage**************"+gPage);
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(ObjectRepo.driver, 10);
		//wait.until(ExpectedConditions.textToBePresentInElementValue(gPage.email, ""));
		gPage.email.sendKeys("rahul.k@360logica.com");
		//ObjectRepo.driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rahul.k@360logica.com");
		System.out.println("**********************Char length of mail id "+ObjectRepo.driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value").length());
		//
	}
	
	 
	 @Then("^: Click on next button$")
		public void clickNext() throws Exception {
				
			System.out.println("**********Data ***************"+ObjectRepo.data);
			gPage = (GmailpPage) ObjectRepo.data.get("GmailPage");
			Thread.sleep(5000);
			gPage.nextBtn.click();
		}

	// @Then("^: I pass password \\”(.*)\\”$”")I pass password abc
	 	@Then("^: I pass password abc")
		public void enterPassword() throws Exception {
				
			System.out.println("**********Data ***************"+ObjectRepo.data);
			gPage = (GmailpPage) ObjectRepo.data.get("GmailPage");
			Thread.sleep(5000);
			gPage.password.sendKeys("Rahul.k@360");
		}
	 @Then("^: Click on passNext button$")
		public void clickPassNext() throws Exception {
				
			System.out.println("**********Data ***************"+ObjectRepo.data);
			gPage = (GmailpPage) ObjectRepo.data.get("GmailPage");
			Thread.sleep(5000);
			gPage.passwordNext.click();
			
		}
	 
}
