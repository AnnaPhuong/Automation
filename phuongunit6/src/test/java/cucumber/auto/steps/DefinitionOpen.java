package cucumber.auto.steps;

import cucumber.api.java.en.Given;
import cucumber.auto.steps.serenity.OpenSteps;

public class DefinitionOpen {
	OpenSteps openStep;

	@Given("^Open google$")
	public void open_google() {
		openStep.open_home_page();
	}

}
