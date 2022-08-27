package demoWebShopPOM;

import org.testng.annotations.Test;

import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class LoginCaseTest extends BaseTest {
	@Test
	public void testCase1()
	{
		WelcomePage welcomPage=new WelcomePage(driver);
		welcomPage.clickLogin();
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail("sanjana");
		loginPage.enterPassword("Sanjana");
	}
}