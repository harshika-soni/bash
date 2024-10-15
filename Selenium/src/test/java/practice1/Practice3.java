package practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.emicalculator.net");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<4;i++) {
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
				
		}
		for(int i=0;i<2;i++) {
			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(1000);
				
		}
        TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShotImgs.png");
		FileUtils.copyFile(src1, dest1);
		
	List<WebElement> Interest = driver.findElements(By.xpath("//td[@class='col-3 col-sm-2 currency']/../..//td[3]"));	
	
	             for(WebElement ele:Interest) {
	            	 System.out.println(ele.getText());
	             }

	}

}
