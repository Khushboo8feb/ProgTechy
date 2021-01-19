package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) {
		
        //Setting the ChromeDriver path 
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		//Creating WebDriver Instance
		WebDriver driver = new ChromeDriver();
		
		//Navigate to web page 
		driver.get("https://demoqa.com/login");
		
		//Maximize window 
		driver.manage().window().maximize();
		
		//Putting implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Retrieving Page Title
		String title = driver.getTitle();
		System.out.println("The page title is :" +title);
		
		//Locating WebElements 
		WebElement userName = driver.findElement(By.id("userName"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));
		
		//Performing actions on WebElement 
		userName.sendKeys("testuser");
		password.sendKeys("Password@123");
		loginBtn.click();
		
		try 
		{  
			//Locating Web Element 
			WebElement logoutBtn = driver.findElement(By.id("submit"));	
			//Validating presence of Element 
			if(logoutBtn.isDisplayed())
			{
				logoutBtn.click();
				System.out.println("User logged out Successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
