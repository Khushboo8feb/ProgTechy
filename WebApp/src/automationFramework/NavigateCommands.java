package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	/*
	 Launch new Browser
    Open DemoQA.com website
    Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
    Come back to Home page (Use ‘Back’ command)
    Again go back to Registration page (This time use ‘Forward’ command)
    Again come back to Home page (This time use ‘To’ command)
    Refresh the Browser (Use ‘Refresh’ command)
    Close the Browser
*/

	public static void main(String[] args) {
		String driverExecutablePath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
		String appURL = "https://www.networksolutions.com/";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath );
		WebDriver driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("account-name")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(appURL);
		driver.navigate().refresh();
		driver.close();
		
	}

}
