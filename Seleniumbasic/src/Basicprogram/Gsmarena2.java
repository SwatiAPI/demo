package Basicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String chromeExePath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		
		driver.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]")).click();
		
		List<WebElement> mobiles= driver.findElements(By.cssSelector())
		
		
		
		
		
		
		
		
		
		
		
	}

}
