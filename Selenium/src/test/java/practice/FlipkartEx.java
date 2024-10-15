package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.in");
		Thread.sleep(1000);
//driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("iphone");
//driver.findElement(By.className("Pke_EE")).sendKeys("Adidas");
//driver.findElement(By.className("_2iLD__")).click();
//driver.findElement(By.cssSelector("[title='Printed Women Black Sports Shorts']")).click();
		driver.findElement(By.linkText("Mobiles")).click();

	//driver.findElement(By.cssSelector("[alt='Sale is Live']")).click();
		
	driver.findElement(By.cssSelector("[class='suthUA']")).click();
//	driver.findElement(By.linkText("Motorola g64 5G (Pearl Blue, 128 GB)")).click();
		
	}

}
