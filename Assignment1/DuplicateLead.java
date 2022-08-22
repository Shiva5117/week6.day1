package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends ParentClass{

	@Test
	public void duplicateLead() {
						
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
		
		//Click on Duplicte Button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soorya");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page
		String tittle1 = driver.getTitle();
		System.out.println(tittle1);
				

	}

}