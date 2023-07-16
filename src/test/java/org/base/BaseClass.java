package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void passText(String text, WebElement ele) {
		ele.sendKeys(text);
	}

	public static void clickButton(WebElement ele) {
		ele.click();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static Robot r;

	public static void robotVK_ENTER() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static Actions a;

	public static void actionsMoveToElement(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public static void threadSleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void threadSleep20() throws InterruptedException {
		Thread.sleep(20000);
	}
	
	public static void startDateAndTime() {
		Date d=new Date();
		System.out.println('\n' + "Start date and time: " + d);
	}
	
	public static void endDateAndTime() {
		Date d=new Date();
		System.out.println("End date and time: " + d);
	}

	public static Actions a1;

	public static void readCount(WebElement getGroupInfo, WebElement totalMembers, WebElement getGivenInputMessage,
			WebElement getArrowButton, WebElement getMessageInfo, List<WebElement> remaining)
			throws InterruptedException {
		getGroupInfo.click();
		threadSleep();

//		Getting the total group members list
		String text = totalMembers.getText();
		String removeString = text.replaceAll("\\D+", "");
		int integer = Integer.parseInt(removeString);
		int totalGroupMembers = integer - 1;

		threadSleep20();
		a1 = new Actions(driver);
		a1.moveToElement(getGivenInputMessage).perform();
		getArrowButton.click();
		threadSleep();
		getMessageInfo.click();

//		Getting the remaining values in read by column
		int lastSize = remaining.size() - 1;
		WebElement lastElement = remaining.get(lastSize);
		String text2 = lastElement.getText();
		String removeString2 = text2.replaceAll("\\D+", "");
		int remainingMembers = Integer.parseInt(removeString2);

//		Subtracting totalGroupMembers - remaining members. To get the total read count of the message
		int totalReadCount = totalGroupMembers - remainingMembers;
		System.out.println("Total Read Count of the selected message: " + totalReadCount);
	}

	public static void closeEntireBrowser() {
		driver.quit();
		System.out.println("Execution Completed");
	}
}