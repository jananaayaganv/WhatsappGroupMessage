package org.stepdefinition;

import java.awt.AWTException;
import org.base.BaseClass;
import org.pojo.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WhatsAppTest extends BaseClass {

	Pojo p;

	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launBrowser();
	}

	@When("To launch the URL of the WhatsApp")
	public void to_launch_the_URL_of_the_WhatsApp() {
		launchUrl("https://web.whatsapp.com/");
		windowMaximize();
	}

	@When("To scan the QR code manually through mobile")
	public void to_scan_the_QR_code_manually_through_mobile() {
		startDateAndTime();
		System.out.println("Scan the QR code manually through mobile");
		endDateAndTime();
	}

	@When("To click the WhatsApp Group")
	public void to_click_the_WhatsApp_Group() {
		startDateAndTime();
		System.out.println("Now WhatsApp has opened");
		endDateAndTime();
		implicitWait();
		p = new Pojo();
		clickButton(p.getGroupName());
	}

	@When("To send message in the group")
	public void to_send_message_in_the_group() throws AWTException, InterruptedException {
		p = new Pojo();
		clickButton(p.getTextBox());
		passText("Hi, how are you?", p.getTextBox());
		robotVK_ENTER();
	}

	@When("To read the peolpe count and display")
	public void to_read_the_peolpe_count_and_display() throws InterruptedException {
		startDateAndTime();
		readCount(p.getGroupInfo(), p.getTotalMembers(), p.getGivenInputMessage(), p.getArrowButton(),
				p.getMessageInfo(), p.getRemaining());
		endDateAndTime();
	}

	@When("To delete the sent message")
	public void to_delete_the_sent_message() throws InterruptedException {
		threadSleep();
		p = new Pojo();
		actionsMoveToElement(p.getGivenInputMessage());
		clickButton(p.getArrowButton());
		clickButton(p.getDelete());
		threadSleep();
		clickButton(p.getDeleteForMe());
	}

	@When("To click the menu")
	public void to_click_the_menu() throws InterruptedException {
		threadSleep();
		p = new Pojo();
		clickButton(p.getMenu());
	}

	@When("To click the log out")
	public void to_click_the_log_out() throws InterruptedException {
		p = new Pojo();
		clickButton(p.getLogOut());
		threadSleep();
		clickButton(p.getLogOutConfirm());
	}

	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException {
		startDateAndTime();
		threadSleep();
		closeEntireBrowser();
		endDateAndTime();
	}
}