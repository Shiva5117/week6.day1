package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {

	ChromeDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
		//Download and set the path
		WebDriverManager.chromedriver().setup();
				
		//Launch the ChromeBrowser
		driver = new ChromeDriver();
				
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads Link
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@AfterMethod
	public void afterMethod() {
		//Close the browser
		driver.close();
		}
	}
