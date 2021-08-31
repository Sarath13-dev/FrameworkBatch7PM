package org.stepdef;

import org.base.BaseClass;
import org.locator.LogPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	LogPage page;

	@Given("user is on Facebook application")
	public void user_is_on_Facebook_application() {
		getDriver();
		launcUrl("https://adactinhotelapp.com/");
	}

	@When("user is going enter {string} and {string}")
	public void user_is_going_enter_and(String string, String string2) {
		page = new LogPage();
		WebElement username = page.getUsername();
		enterText(username, string);
		WebElement password = page.getPassword();
		enterText(password, string2);
	}

	@Then("user sould click login button")
	public void uh() {
		WebElement login = page.getLogin();
		buttonClick(login);
	}

}
