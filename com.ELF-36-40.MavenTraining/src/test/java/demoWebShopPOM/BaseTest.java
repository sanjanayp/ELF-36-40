package demoWebShopPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void saetUpBrowser(@Optional ("chrome") String browserName)
	{
		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		} else if(browserName.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browser name not specified");
		}
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	@AfterClass
	public void browseerTearDown()
	{
		driver.quit();
	}
	}

