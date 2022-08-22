package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LeadTest extends ParentClass{

	@Test
	public void leadTest() {
		
		//Click Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		//Enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivasakthi");
		
		//Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//Dropdown
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Partner");
		select.selectByValue("LEAD_EXISTCUST");
		
		//Click /submit button
		driver.findElement(By.name("submitButton")).click();
		
		//Verify the lead page
		String header = driver.getTitle();
		System.out.println(header);
		if (header.equals("View Lead | opentaps CRM")) {
			System.out.print("Verified the Lead page");
		}

	}

}
