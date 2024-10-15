package advancescenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.bigbasket.com/");
		 driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apple",Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
	//	 List<WebElement> Apple = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']/../../..//div[@class='flex flex-col gap-0.5']"));
		 List<WebElement> Apple1 = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		// List<WebElement> Apple1Price=driver.findElements(By.xpath("//div[@class='flex flex-col gap-0.5']"));
		   
for(int i=0;i<Apple1.size();i++) {
	
	System.out.println(Apple1.get(i).getText());//+"-------------"+Apple1Price.get(i).getText());
		 
}
		 
		 
		 
		 //for(WebElement ele:Apple) {
    	//System.out.println(ele.getText());
	
	
	
	}

}
