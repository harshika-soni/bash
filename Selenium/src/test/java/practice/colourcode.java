package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class colourcode {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
	
	WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
System.out.println(	ele.getCssValue("color"));

}
}