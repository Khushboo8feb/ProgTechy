package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
	/*
    Launch a new Chrome browser.
    Open Shop.DemoQA.com //https://www.flipkart.com/
    Get Page Title name and Title length
    Print Page Title and Title length on the Eclipse Console.
    Get Page URL and verify if it is a correct page opened
    Get Page Source (HTML Source code) and Page Source length
    Print Page Length on Eclipse Console.
    Close the Browser.
 */

	public static void main(String[] args) {
		String driverExecutablePath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
		String appURL = "https://www.toolsqa.com/automation-practice-switch-windows/";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath );
		WebDriver driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		int pageTitlelength = pageTitle.length();
		System.out.println("Page Title is: "+pageTitle+ "and page title length: "+pageTitlelength);
		String pageURL = driver.getCurrentUrl();
		if(pageURL.equalsIgnoreCase(appURL))
		{
			System.out.println("Verification Successful: We are on correct page and page URL is:" +pageURL);
		}
		else
		{
			System.out.println("Verification Failed: We are not on correct page and page URL is:" +pageURL);

		}
		String pageSourceCode = driver.getPageSource();
		int pageSourceCodeLength = pageSourceCode.length();
		System.out.println("The Page Source Length is: "+pageSourceCodeLength);
		driver.close();

	}

}
