package lanuchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// How to add the Extranal Jar files to our project
		
		// Go to Right click on Selenium > Builpath> Configured Build Path>Select Library Tab> Click on Class Patch>Click on add Extranal Jar files C.Drive > add only jar files > apply and close
		
		
// How to Lunch the Crome Brower:
		
	//	WebDriver driver = new ChromeDriver();   --- to open the chrome url
		
	//	ChromeDriver driver = new ChromeDriver(); 
	
		/* Note: 
		 * WebDriver is a interface
		 * driver is a referance object, 
		 * Equeal (=) is a operator, 
		 * new is the Keyword, 
		 * ChromeDriver is a class
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// driver.manage().window().minimize();
		
	//	driver.manage().window().fullscreen();
		
	//	driver.close();
		
	//	driver.quit();
		
/*
		
In Selenium WebDriver, close() and quit() are methods used to manage browser windows, but they differ in their scope and effect:
1. driver.close();

Functionality:
Closes the currently focused browser window or tab that the WebDriver instance is interacting with.
		
1. driver.quit();

Functionality:
Closes all browser windows and tabs associated with the WebDriver instance and terminates the entire WebDriver session.

*/

		
WebDriver driver = new ChromeDriver();
Thread.sleep(4000);
//ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(1000);
//driver.get("https//www.google.com/");
driver.get("https://www.google.com/");
driver.navigate().back();
Thread.sleep(2000);
driver.get("https://www.hp.com/");
driver.navigate().forward();
driver.navigate().to("https://www.mrftyres.com/");
Thread.sleep(2000);
driver.quit();
		
	


		
		
		
	}

}
