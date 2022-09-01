package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookBasicValidationfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String driverPath3=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
		
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new FirefoxDriver();
		
		//enter the URL
		
		driver.get("https://www.facebook.com/");
		
		//validate page tite
		
		String pageTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("Title validation: "+pageTitle.equals(expectedTitle));
		
		//validate current url
		String pageURL=driver.getCurrentUrl();
		String expectedURL="https://www.Facebook.com/";
		System.out.println("Page URL validation: "+pageURL.equals(expectedURL));
		
			//close the current browser instance
		driver.close();
	}

		
}

