package Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("Rajaram");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[contains(text(),'DevLogs')]")).click();
		String expectedTitle="View Lead | opentaps CRM";
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		String latestCompanyName="Testleaf software solutions";
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(latestCompanyName);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String updatedeCompanayName=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(updatedeCompanayName.contains(latestCompanyName))
			System.out.println("Updated Company name appears");
		else
			System.out.println("Company name not updated properly");
		driver.close();
		
	

	}

}
