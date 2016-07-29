package auto.bdd.steps.serenity;

import org.junit.Assert;

import auto.bdd.pages.OpenPage;
import net.thucydides.core.steps.ScenarioSteps;

public class OpenStep extends ScenarioSteps {

	OpenPage openPage;

	public void open_home_page() {
		openPage.open();

	}

	public void input_username(String username) {
		openPage.enter_username(username);

	}

	public void click_button() {
		openPage.click_button_longin();

	}

	public void verify_msg_alert(String msg) {
		String actual = openPage.getMsg();
		Assert.assertEquals(msg, actual);

	}

}
