package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.UtubeScreenShot;

public class PoMImplementation {
public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FileInputStream fis= new FileInputStream("./src/test/resources/UTube.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		           String KEY = pro.getProperty("key");
		       driver.get(URL);
	   UtubeScreenShot uss=new  UtubeScreenShot(driver);  
		       uss.getSearchTextfield().sendKeys(KEY);
		       uss.getSearchbutton().click();
		       uss.getVedioImg().click();
		       
	          String mainId = driver.getWindowHandle();
		System.out.println(mainId);
           Set<String> AllId = driver.getWindowHandles();
                           System.out.println(AllId);
                   for(String ID:AllId)  {
                	   if(!mainId.equals(ID)) {
                		   driver.switchTo().window(ID);
                	   }
                   }
                TakesScreenshot tss = (TakesScreenshot)driver;
            File src = tss.getScreenshotAs(OutputType.FILE);
                           File dest = new File("./screenshotImgs.png") ;  
                           FileUtils.copyFile(src, dest);
            
                
                           
                           
                           
                           
                           
                           
                           
	}

}
