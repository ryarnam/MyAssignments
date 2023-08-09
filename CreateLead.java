package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	//To pass the values to form
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DevLogs");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajaram");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chellappa");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raja");
	driver.findElement(By.name("departmentName")).sendKeys("Quality Analyst");
	driver.findElement(By.name("description")).sendKeys("Test program");
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9787348997");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ryanram.sas@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	//Edit description
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description Updated");
		driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	}
	}