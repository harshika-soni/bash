package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws Throwable {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();//maximize browser
			 driver.get("https://www.youtube.com/");
			 Thread.sleep(2000);
			 
			 WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));//.sendKeys("Song",Keys.ENTER);
			 search.sendKeys("song",Keys.ENTER);

	}

}
