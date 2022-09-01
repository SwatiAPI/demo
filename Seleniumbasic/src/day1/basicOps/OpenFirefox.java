package day1.basicOps;
import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * path: 
		 * 1.Absolute path --> "E:\\workspacenew\\Seleniumbasic\\Executable\\geckodriver.exe");
		 * 2. Relative path -->.\\Executable\\geckodriver.exe
		 * * Step2: create an instance of required browser class
		 */
		
		String currentWorkingDir = System.getProperty("user.dir");/*E:\\workspacenew\\Seleniumbasic*/
		System.out.println(" Current Working dir:  " + currentWorkingDir);
		
		String FirefoxExePath= currentWorkingDir + "\\Executable\\\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxExePath);
		
		
		FirefoxDriver ref = new FirefoxDriver();
		ref.get("https://www.google.com");
		ref.close();
	}
}
	