package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
	//we need to find the number of elements having tag name as “input ”

	public static void main(String[] args) {
		String driverExecutablePath = "D:\\software\\chromedriver_win32\\chromedriver.exe";
		String appURL = "https://demoqa.com/text-box/";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath );
		WebDriver driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
		if(allInputElements.size() !=0)
		{
			System.out.println(allInputElements.size()+  "Element found by tagName as input \n");
		}
		for(WebElement inputElement: allInputElements)
		{
			System.out.println(inputElement.getAttribute("placeholder"));
		}

	}

}
