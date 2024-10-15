package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(1000);
		 
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");

 driver.findElement(By.xpath("//button[@type='submit']")).click();
 //Traversing using ParentChild RelationShip.
   String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 12 (Black, 64 GB)']/../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
  System.out.println(price);
//String price1=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
	
	//System.out.println(price1);
	
	//Traversing using Sibling
//String price3=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
//	System.out.println(price3);
	
//	String name= driver.findElement(By.xpath("//div[text()='₹56,999']/../../../preceding-sibling::div[@class='col col-7-12']//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']")).getText();
  //System.out.println(name);
	
	}

}
