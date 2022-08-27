package demoWebShop;
//23-08-2022
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WhishlistTest {
	@Test
	public void whishList()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("ico-login")).click();
		 driver.findElement(By.id("Email")).sendKeys("sanjanaap@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("sanjanaP");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("SmartPhone");
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
		 driver.findElement(By.xpath("//a[text()='Smartphone']")).click();
		 driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		 driver.findElement(By.xpath("(//a[@class='ico-wishlist'])[1]")).click();
	}

}