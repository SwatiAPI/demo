package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentis {

	public static void main(String[] args) {
		
        String currentWorkingDir = System.getProperty("user.dir"); /* E:\\workspacenew\\Seleniumbasic\\ */
		
		String chromeExePath= currentWorkingDir + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		// ChromeDriver ref=new ChromeDriver(); // or 
		// create an instance of Chrome browser and Upcasting it to WebDriver Interface
		
		WebDriver driver =new ChromeDriver();
		
		//enter the URL
		
		driver.get("https://sampleapp.tricentis.com/101/");

		String pageTitle=driver.getTitle();
		System.out.println("page title is: " +pageTitle);
		System.out.println("page title length: " +pageTitle.length());
		System.out.println("page title status: " +pageTitle.equals("Tricentis Vehicle Insurance"));
		
		String pageURL=driver.getCurrentUrl();
		System.out.println("page URL is: " +pageURL);
		System.out.println("Page URL status: "+pageURL.equals("https://sampleapp.tricentis.com/101/"));
		String pageContent=driver.getPageSource();
		System.out.println("page Source is: " +pageContent);
		System.out.println("page URL is:  "+ pageContent.length());
			//close the current browser instance
		driver.close();
	}

		
}

