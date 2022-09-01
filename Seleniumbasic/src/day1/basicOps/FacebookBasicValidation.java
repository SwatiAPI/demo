package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBasicValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverPath3=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		
		//enter the URL
		
		driver.get("https://www.facebook.com");

		String pageTitle=driver.getTitle();
		String pageUrl=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		
		System.out.println("page title is: " +pageTitle);
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("page title length: " +pageTitle.length());
		
		System.out.println("page Url is: " +pageUrl);
		//validate current url
		String expectedURL="https://www.facebook.com";
		System.out.println("Page URL validation: "+pageUrl.contains(expectedURL));
		
		System.out.println("page source length:  "+ pageSource.length());
			//close the current browser instance
		driver.close();
	}

		
}


