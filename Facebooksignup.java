package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Adhidev");
		driver.findElement(By.name("lastname")).sendKeys("Rajaram");
		driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
		driver.findElement(By.name("reg_email__")).sendKeys("adhidev@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("adhidev@gmail.com");

		WebElement birthdayday = driver.findElement(By.name("birthday_day"));
		Select bdd = new Select(birthdayday);
		bdd.selectByIndex(10);
		Thread.sleep(2000);
		WebElement birthdaymonth = driver.findElement(By.name("birthday_month"));
		Select bdm = new Select(birthdaymonth);
		bdm.selectByIndex(2);
		Thread.sleep(2000);
		WebElement birthdayyear = driver.findElement(By.name("birthday_year"));
		Select bdy = new Select(birthdayyear);
		bdy.selectByVisibleText("1990");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click(); 
		driver.findElement(By.name("websubmit")).click();

	}

}
