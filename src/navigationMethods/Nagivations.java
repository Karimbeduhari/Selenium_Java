package navigationMethods;   // ---which is package name

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Nagivations {  //-- which is class name

	public static void main(String[] args) throws Exception {  // --main is method name
		// TODO Auto-generated method stub

	//	WebDriver driver = new SafariDriver();  -- which is failing due to no safari browser
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.get("https://www.google.com");   //-- main application lunching
		Thread.sleep(2000);
		driver.navigate().to("https://www.fb.com"); // from main application to third party application lunching
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.quit();
		
	}

	
}
