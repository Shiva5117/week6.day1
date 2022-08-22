package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {

	ChromeDriver driver;
	//
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url, String userid, String passphrase) {
		//Download and set the path
		WebDriverManager.chromedriver().setup();
				
		//Launch the ChromeBrowser
		driver = new ChromeDriver();
				
		//Load the URL
		driver.get(url);
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys(userid);
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys(passphrase);
		
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads Link
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@AfterMethod
	public void postCondition() {
		//Close the browser
		driver.close();
	}

}
