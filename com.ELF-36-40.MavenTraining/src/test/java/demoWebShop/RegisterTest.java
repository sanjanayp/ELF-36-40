package demoWebShop;
//23-08-2022
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
	public void register() {
	String firstname="Sanjana", lastname="p", em="sanjanaap@gmail.com", pw="sanjanaP", cpw="sanjanaP";
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.className("ico-register")).click();
     
	driver.findElement(By.id("gender-female")).click();
	
	 driver.findElement(By.name("FirstName")).sendKeys(firstname);
	
	 driver.findElement(By.name("LastName")).sendKeys(lastname);
	
	 driver.findElement(By.name("Email")).sendKeys(em);
	
	 driver.findElement(By.name("Password")).sendKeys(pw);
	
	 driver.findElement(By.name("ConfirmPassword")).sendKeys(cpw);
	
	 driver.findElement(By.name("register-button")).click();
}
	
}
