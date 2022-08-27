package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public  RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="ico-register")
	WebElement registerLink;
	public void clickRegister()
	{
		registerLink.click();
	}
	@FindBy(id="gender-female")	
	WebElement genderButton;
	public void clickButton()
	{
		genderButton.click();
	}
	@FindBy(id="FirstName")
	WebElement enterFN;
	public void enterFirstName(String fn)
	{
		enterFN.sendKeys(fn);
	}
	@FindBy(id="LastName")
	WebElement enterLN;
	public void enterLastName(String ln)
	{
		enterLN.sendKeys(ln);
	}
	@FindBy(id="Email")
	WebElement enterEM;
	public void enterEM(String em)
	{
		enterEM.sendKeys(em);
	}
	@FindBy(id="Password")
	WebElement enterPW;
	public void enterPassword(String pw)
	{
		enterPW.sendKeys(pw);
	}
	@FindBy(id="ConfirmPassword")
	WebElement enterCPW;
	public void enterconfirmPassword(String cpw)
	{
		enterCPW.sendKeys(cpw);
	}
	@FindBy(id="register-button")
	WebElement clickRB;
	public void clickRegisterButton()
	{
		clickRB.click();
	}
	}


