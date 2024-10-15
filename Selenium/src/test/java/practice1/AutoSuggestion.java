package practice1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HandBag");
		List<WebElement> HANDBAG = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
for(WebElement Name:HANDBAG) {
	System.out.println(Name.getText());
	if(Name.getText().contains("handbags for girls")) {
		Name.click();
		
	driver.findElement(By.xpath("(//img[@class='_53J4C-'])[2]")).click();
	String MainId = driver.getWindowHandle();
		System.out.println(MainId);
	 Set<String> AllId = driver.getWindowHandles();
	  System.out.println(AllId);
	 // Thread.sleep(2000);
	  for(String ID:AllId) {
		  if(!MainId.equals(ID)) {
				  driver.switchTo().window(ID);
 WebElement Name1 = driver.findElement(By.xpath("//span[text()='Women Beige Satchel - Mini']"));
			String name = Name1.getText();
			System.out.println(name);
			  
			  
			  
			  }
		  }
	
}	
}
	}
}
