package seleniumlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
	/*	//driver.findElement(By.id("user_login")).sendKeys("hari");
		
		driver.findElement(By.cssSelector("#user_login")).sendKeys("hari"); //--- keep # if we are using the id attribute value 
		
		Thread.sleep(2000);		
		driver.findElement(By.name("pwd")).sendKeys("passsword123");
		Thread.sleep(2000);
		driver.findElement(By.name("rememberme")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.className("wp-login-lost-password")).click();  
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();   //--- keep dot(.) if we are using the class attribute value 
		
		
		
	//	driver.findElement(By.linkText("Lost your password?")).click();
	//	driver.findElement(By.partialLinkText("Lost")).click();
		
	//	driver.get("https://www.ndtv.com/");
		
		driver.get("https://www.redmine.org/");
		
		
		List<WebElement> TotalLinks = driver.findElements(By.tagName("img"));
		System.out.println(TotalLinks.size());
		System.out.println("Total Links on NDTV Website : "+TotalLinks.size());
		
		*/
		
		driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("LohithDhanu");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("12345");

	}

}
