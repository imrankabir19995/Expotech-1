package expotech.Ecommerce;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyTitle extends DriverSetup {
	
	public static String url= "https://expotechglobal.com/";
	private static TimeUnit SECONDS;
	
	@Test (priority=2)
	public static void VerifypageTitle() throws InterruptedException
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String PageTitle= driver.getTitle();
		System.out.println("The page title is:"+ PageTitle);
		Thread.sleep(3000);
		
		String PageTitleExpected= "Expotech | Home";
		Assert.assertEquals(PageTitleExpected, PageTitle);
	} 

	@Test(priority=1)
	public static void isWebsiteSecured()
	{
		String myUrl= driver.getCurrentUrl();
		if(myUrl.contains("https"))
		{
		System.out.println("Site is secured");	
		}else
		{
		System.out.println("Site is secured");
		}
	}
	
}
