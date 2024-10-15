package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();//maximize browser
		 driver.get("https:/www.amazon.in");
		 
	driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
String Price= driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black']/ancestor::div[@class='puisg-row']//span[text()='₹70,900'])[1]")).getText();
System.out.println(Price);
	}

}
