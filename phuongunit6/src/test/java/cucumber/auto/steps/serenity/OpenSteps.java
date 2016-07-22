package cucumber.auto.steps.serenity;

import cucumber.auto.pages.OpenPage;
import net.thucydides.core.steps.ScenarioSteps;

public class OpenSteps extends ScenarioSteps {
	OpenPage openPage;

	public void open_home_page() {
		openPage.open();
		
	}
	
	
}
