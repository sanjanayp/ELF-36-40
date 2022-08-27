package demoWebShop;
//23-08-2022
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginTestCase()  {
		String em="sanjanaap@gmail.com", pw="sanjanaP"; 
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.className("ico-login")).click();
		 driver.findElement(By.id("Email")).sendKeys(em);
		 driver.findElement(By.id("Password")).sendKeys(pw);
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
