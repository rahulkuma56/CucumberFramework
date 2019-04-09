package com.cucumber.framework.configuration.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cucumber.framework.utility.DateTimeHelper;
import com.cucumber.framework.utility.ResourceHelper;

public class EdgeBrowser {
	public Capabilities getEdgeCapabilities() {
		EdgeOptions option = new EdgeOptions();
		//option.addArguments("start-maximized");
		DesiredCapabilities edge = DesiredCapabilities.edge();
		edge.setJavascriptEnabled(true);
		edge.setCapability(EdgeOptions.CAPABILITY, option);
		return edge;
	}

	public WebDriver getEdgeDriver(Capabilities cap) {
		System.setProperty("webdriver.edge.driver",
				ResourceHelper.getResourcePath("driver/MicrosoftWebDriver.exe"));
		System.setProperty("webdriver.chrome.logfile",
				ResourceHelper.getResourcePath("logs/edgelogs/")
						+ "edgelog" + DateTimeHelper.getCurrentDateTime()
						+ ".log");
		return new EdgeDriver(cap);
	}
	
	public WebDriver getEdgeDriver(String hubUrl,Capabilities cap) throws MalformedURLException {
		return new RemoteWebDriver(new URL(hubUrl), cap);
	}
}
