package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1EX {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		//div[@class='YGcVZO _2VHNef']/ancestor::ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li
		driver.get("https://www.flipkart.com/");
		
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))	;
     
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HandBag");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']/ancestor::ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
for(WebElement Name:list) {
	System.out.println(Name.getText());
}
	}

}
