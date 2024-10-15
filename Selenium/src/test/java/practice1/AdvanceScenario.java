package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apple",Keys.ENTER);
    driver.findElement(By.xpath("//img[@title='fresho! Apple - Red Delicious / Washington, Regular 2x4 pcs']")).click();
                 String mainID = driver.getWindowHandle();
                  Set<String> AllID = driver.getWindowHandles();
          for(String ID:AllID) {
        	  if(!mainID.equals(ID)) {
        		  driver.switchTo().window(ID);
        		  String name=driver.findElement(By.xpath("//h1[@class='Description___StyledH-sc-82a36a-2 bofYPK']")).getText();
        	  System.out.println(name);
        	 WebElement ele = driver.findElement(By.xpath("(//button[@color=\"silverSurfer\"])[4]"));
        	 String Colour = ele.getCssValue("color");
        	 System.out.println(Colour);
        	TakesScreenshot tss = (TakesScreenshot)driver;
                    File src = tss.getScreenshotAs(OutputType.FILE);
                               File destination = new File("./ScreenShot.imgs.png");
                               FileUtils.copyFile(src, destination);
     }
          }
          
                  
            
                  
                  
                  
                  
	}

}
