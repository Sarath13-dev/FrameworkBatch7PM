package org.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClasss {

	@Before
	public void beforeScenario() {
		System.out.println("Execute Before Each Scenario");

	}

	@After
	public void afterScenario() {
		System.out.println("Execute After Each Scenario");

	}
}
