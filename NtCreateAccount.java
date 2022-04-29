package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NtCreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement( By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement( By.xpath("//select[@id='currencyUomId']")).sendKeys("Indian Rupee");
		driver.findElement(By .xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.id("groupNameLocal")).sendKeys("abc");
		driver.findElement(By.id("officeSiteName")).sendKeys("tata");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("50000000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.findElement(By.xpath("//li[@class='errorMessage']")).getText());
		
	}

}
