package advancescenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonJewelarryBoxColour {

	public static void main(String[] args) throws Throwable {
	
		// TODO Auto-generated method stub
				 WebDriver driver= new ChromeDriver();
				  driver.manage().window().maximize();//maximize browser
				
				 driver.get("https://www.amazon.in");
				
				 
				 driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("jewellary box");
			 driver.findElement(By.cssSelector("[value='Go']")).click();
			

			 
			 Thread.sleep(2000);

		List<WebElement> ColourName	=driver.findElements(By.xpath("(//span[text()='YouBella'])[4]/../../../..//div[@class='a-section s-color-swatch-container s-quick-view-text-align-start']//a"));
					for(WebElement JewellaryColour:ColourName) {
						String colours = JewellaryColour.getAttribute("aria-label");
						Thread.sleep(2000);
						System.out.println(colours);
					}


	}

}
