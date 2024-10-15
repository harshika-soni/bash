package advancescenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class spicejet {

	public static void main(String[] args) throws Throwable {
		
		
		//Approach1:==>close the notification
		ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@dir=\"auto\"])[1]")).sendKeys("DEL");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("AMD");
  
	}
}
