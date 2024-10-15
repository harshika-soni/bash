package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		//launching the browser
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();//maximize browser
		 //launching Application
		 
		 driver.get("https:/www.amazon.in");
		 
		 //finding element by name method()
		 
		 driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	//	 driver.findElement(By.linkText("Amazon miniTv")).click();
		 
		// driver.findElement(By.linkText("Today's Deals")).click();
		// driver.findElements(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
		 
//String Price=driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/../../../../div[3]//span[text()='49,300']")).getText();
	
	//System.out.println(Price);
	String Price=driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Green']/../../../../div[3]//span[@class='a-price-whole']")).getText();
	
	System.out.println(Price);
	}

}
