package auto.bdd.steps;

import auto.bdd.steps.serenity.OpenStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionStep {
	@Steps
	OpenStep openStep;

	@Given("^Open rediff page$")
	public void open_rediff_page() {
		openStep.open_home_page();

	}
	
	@When("^I am input username is \"([^\"]*)\"$")
	public void i_am_input_username_is(String username)  {
		openStep.input_username(username);
	}
	
	
	@When("^user click Signin button$")
	public void user_click_Signin_button()  {
		openStep.click_button();
	    
	}
	
	@Then("^I verify the error message is \"([^\"]*)\"$")
	public void i_verify_the_error_message_is(String msg)  {
		openStep.verify_msg_alert(msg);
	   
	}

	

}
