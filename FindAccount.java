package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement( By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(  By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement( By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		driver.findElement(By.linkText("Credit Limited Account")).click();
		driver.findElement(By.xpath("//a[contains (text(),'Edit')]")).click();
		System.out.println(driver.findElement(By.id("accountName")).getText());
		System.out.println(driver.findElement(By.name("description")).getText());
		System.out.println("The Title Is :" + driver.getTitle());
		
		

		
	}

}
