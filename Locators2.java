import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/asmaabufayah/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
	

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// TODO Auto-generated method stub
		
		String name = "Asma";
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000);
		
		System.out.println( driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		Assert.assertEquals( driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		


	}

}
