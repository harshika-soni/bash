package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		//By.id()[method]
// By id searchtextbox showing 1 of 2 element,not showing uniqueness
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
driver.findElement(By.id("nav-search-submit-button")).click();
//method:2 --->by name()
//driver.findElement(By.name("field-keywords")).sendKeys("puma");
//by name(),submit button is not there
//driver.findElement(By.linkText("Today's Deals")).click();//by linkText()
//driver.findElement(By.partialLinkText("Today's De")).click();
 //driver.findElement(By.cssSelector("[type='text']")).sendKeys("Adidas");
 //driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}
