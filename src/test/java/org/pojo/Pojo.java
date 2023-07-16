package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {

	public Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='WhatsApp Testing']")
	private WebElement groupName;

	@FindBy(xpath = "(//p[@class='selectable-text copyable-text iq0m558w'])[2]")
	private WebElement textBox;

	@FindBy(xpath = "(//span[contains(text(),'Hi, how are you?')])[2]")
	private WebElement givenInputMessage;

	@FindBy(xpath = "//div[@data-js-context-icon='true']")
	private WebElement arrowButton;

	@FindBy(xpath = "//span[@data-testid='conversation-info-header-chat-title']")
	private WebElement groupInfo;

	@FindBy(xpath = "//div[text()='Message info']")
	private WebElement messageInfo;

	@FindBy(xpath = "(//span[@data-testid='menu'])[1]")
	private WebElement menu;

	@FindBy(xpath = "(//div[@class='iWqod _1MZM5 _2BNs3'])[7]")
	private WebElement delete;

	@FindBy(xpath = "//div[text()='Delete for me']")
	private WebElement deleteForMe;

	@FindBy(xpath = "(//div[@class='iWqod _1MZM5 _2BNs3'])[6]")
	private WebElement logOut;

	@FindBy(xpath = "//div[text()='Log out']")
	private WebElement logOutConfirm;

	@FindBy(xpath = "//button[contains(text(),'participants')]")
	private WebElement totalMembers;

	@FindBy(xpath = "//span[@class='f8jlpxt4 e4qy2s3t pm5hny62 e1gr2w1z']")
	private List<WebElement> remaining;

	public WebElement getGroupName() {
		return groupName;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getGivenInputMessage() {
		return givenInputMessage;
	}

	public WebElement getArrowButton() {
		return arrowButton;
	}

	public WebElement getGroupInfo() {
		return groupInfo;
	}

	public WebElement getMessageInfo() {
		return messageInfo;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getDeleteForMe() {
		return deleteForMe;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLogOutConfirm() {
		return logOutConfirm;
	}

	public WebElement getTotalMembers() {
		return totalMembers;
	}

	public List<WebElement> getRemaining() {
		return remaining;
	}

}