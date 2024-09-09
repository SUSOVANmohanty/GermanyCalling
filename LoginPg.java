package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class LoginPg extends Base{
	
    @FindBy(xpath="//input[@id='username']") private WebElement user;
	@FindBy(xpath="//input[@id='password']") private WebElement pswrd;
	@FindBy(xpath="//button[text()='Log In']") private WebElement Login;
    public LoginPg()
    {
    	PageFactory.initElements(driver, this);
    }
    public String SuccessfulLogin() throws InterruptedException
    {
    	
    	user.sendKeys("mohantysusovan04@gmail.com");
    	Thread.sleep(2000);
    	pswrd.sendKeys("AGV12345");
    	Thread.sleep(2000);
    	Login.click();
    	System.out.println("Login Successfull");
		return driver.getCurrentUrl();	
    }
    public String  UnSuccessfulLogin() throws InterruptedException
	{
		user.click();
		Thread.sleep(2000);
		user.sendKeys("mohantysusovan04@gmail.com");
		Thread.sleep(2000);
		pswrd.sendKeys("smk45");
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(2000);
		System.out.println("Please Enter Valid Credentials");
		return driver.getCurrentUrl();
}
}
