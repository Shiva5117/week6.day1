package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead {
	
	@Test
	public void testng1() {
		// TODO Auto-generated method stub
		//Call WDM
		WebDriverManager.chromedriver().setup();
		
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Enter Username and Password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//Click Leads Link
		driver.findElement(By.linkText("Leads")).click();
				
		//Click Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
				
		//Enter the Companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
				
		//Enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivasakthi");
				
		//Enetr the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//Enter the firstname(local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shiva");
		
		//Enter the deparment
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ITM");
		
		//Enter Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead Page");
		
		//Enter your email in the E-mail address Field
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sss@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page
		String tittle = driver.getTitle();
		System.out.println(tittle);
		

	}

}
