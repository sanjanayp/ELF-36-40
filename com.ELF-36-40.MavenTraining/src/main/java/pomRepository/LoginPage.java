package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement emailTF;
	
	public void enterEmail(String email)
	{
		emailTF.sendKeys(email);
	}
	@FindBy(id="Password")
	WebElement passwordTF;
	
	public void enterPassword(String pwd)
	{
		passwordTF.sendKeys(pwd);
	}
	
}
