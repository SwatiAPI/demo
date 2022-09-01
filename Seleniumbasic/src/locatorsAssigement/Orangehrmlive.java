package locatorsAssigement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String currentWorkingDir=System.getProperty("user.dir");/*E:\workspacenew\Seleniumbasic*/
		String chromeExePath=currentWorkingDir+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		/**
		 * to perform any operation first we need to identify the object/element from the 
		 * application dn you can perform any required operation:
		 * 		input type: sendkeys("Input");
		 * 		click	  : click();
		 * 		existing text deletion: clear();
		 */
		/*Identify User name field*/
		WebElement username=driver.findElement(By.id("username"));
		/*perform require operation in the username field*/
		username.clear();
		username.sendKeys("admin");
		
		/*Identify password field*/
		WebElement pwd=driver.findElement(By.name("password"));
		/*perform require operation in the pwd field*/
		pwd.clear();
		pwd.sendKeys("admin123");
		
		/*Identify Sign in Button*/
		WebElement signInButton=driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		/*perform require operation in the Sign in Button*/
		signInButton.click();
		
		
		driver.close();
	}

}


