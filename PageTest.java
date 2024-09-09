package PagesTestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Pages.LoginPg;

public class PageTest extends Base{
	
	LoginPg lp;
	@BeforeMethod
	public void setup()
	{
		initialization();
		lp=new LoginPg();
	}
	@Test
	public void SuccessfulLoginTest() throws InterruptedException
	{
		String expURL="https://app.germanyiscalling.com/cv/upload/";
	    String actURL=lp.SuccessfulLogin();
	    Assert.assertEquals(expURL, actURL);
	}
	@Test
	public void UnSuccessfulLoginTest() throws InterruptedException
	{
		String expURL="https://app.germanyiscalling.com/cv/upload/";
	    String actURL=lp.UnSuccessfulLogin();
	    Assert.assertEquals(expURL, actURL);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
