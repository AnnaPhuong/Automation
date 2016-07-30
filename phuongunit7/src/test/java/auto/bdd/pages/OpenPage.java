package auto.bdd.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://mail.rediff.com/cgi-bin/login.cgi")
public class OpenPage extends PageObject {

	@FindBy(id = "login1")
	WebElementFacade inputUsername;

	public void enter_username(String username) {

		inputUsername.type(username);
	}

	@FindBy(name = "proceed")
	WebElementFacade clickButton;

	public void click_button_longin() {
		clickButton.click();

	}

	WebDriver verifyMsg;

	public String getMsg() throws Exception {
		Alert alert = verifyMsg.switchTo().alert();
		String alert1 = alert.getText();
		//System.out.println("Alert text is "+ alert1);
		//Thread.sleep(2000);
		//alert.accept();

		return alert1;

	}

}
