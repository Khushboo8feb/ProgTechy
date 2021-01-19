package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_2 {
/*
 * 
    Launch a new Chrome browser.
    Open ToolsQA Practice Automation Page for Switch Windows: https://www.toolsqa.com/automation-practice-switch-windows/
    Use this statement to click on a New Browser Window button “driver.findElement(By.id(“New Browser Window”)).click();”
    Close the browser using close() command
*/
	public static void main(String[] args) {
		String driverExecutablePath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
		String appURL = "https://www.toolsqa.com/automation-practice-switch-windows/";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath );
		WebDriver driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("windowButton")).click();
		//driver.close(); //You will notice that only one window will close. Next time use quit() command instead of close(). At that time selenium will close both the windows.
		driver.quit();

	}

}
