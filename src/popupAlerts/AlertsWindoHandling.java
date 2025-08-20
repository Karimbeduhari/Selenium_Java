package popupAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsWindoHandling {

	public static void main(String[] args) throws Exception {
		
		// 3 type of Alters //
	
		
	// SimpleAlertBox	
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
	/*	driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
		
		Thread.sleep(2000);
		
	//	driver.switchTo().alert().accept(); // how to handle the pop alters in Selenium (Need to use Methods instead of taking X-path)
		
		driver.switchTo().alert().dismiss();  // to click on the cancel button in the alter windos
		
		*/
		
		
	//Prompt Dialog Box//
		
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Lohith");
		
		driver.switchTo().alert().accept();
		
		
	}

}
