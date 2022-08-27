package demoWebShopPOM;

import org.testng.annotations.Test;

import pomRepository.RegisterPage;

public class RegisterCaseTest extends BaseTest {
	@Test
	public void registerTest()
	{
		RegisterPage reg=new RegisterPage(driver);
		reg.clickRegister();
		reg.clickButton();
		reg.enterFirstName("sanjana");
		reg.enterLastName("p");
		reg.enterEM("sanjana@gmail.com");
		reg.enterPassword("sanjanayp");
		reg.enterconfirmPassword("sanjanayp");
		reg.clickRegisterButton();
	}
}
