package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.in");
		 WebElement ele = driver.findElement(By.xpath(" //a[text()='Amazon Web Services']"));
                     Point loc = ele.getLocation();
          System.out.println(loc.getX());
          System.out.println(loc.getY());
          
         JavascriptExecutor js= (JavascriptExecutor)driver;
    //     js.executeScript("window.scrollBy(342, 4519)");
      //      ele.click();
     //       js.executeScript("arguments[0].scrollIntoView()",ele);
       //     ele.click();
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            Thread.sleep(1000);
            js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	
	
	}
	
	

}
