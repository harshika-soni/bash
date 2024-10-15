package advancescenario;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTwitterAccount {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twitter.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harsha");
		driver.findElement(By.xpath("//span[text()='Use email instead']")).click();
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]")).sendKeys("harshika_muz@yahoo.com");
		WebElement monthlist = driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
                 Select sc=new Select(monthlist);
                 sc.selectByVisibleText("December");
                 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                 WebElement daylist = driver.findElement(By.xpath("//select[@id='SELECTOR_2']"));
                 Select sc1=new Select(daylist);
                 sc1.selectByVisibleText("14");
                 WebElement yearlist = driver.findElement(By.xpath("//select[@id='SELECTOR_3']"));
                 Select sc3=new Select(yearlist);
                 sc3.selectByVisibleText("1993");
                 driver.findElement(By.xpath("//span[text()='Next']")).click();
          //       driver.findElement(By.xpath("//button[text()='Authenticate']")).click();
                 Set<String> AllId = driver.getWindowHandles();  //win1,win2
		            
		            for(String id:AllId) {
		            	driver.switchTo().window(id);
		            	String title = driver.getTitle();
		            	System.out.println(title);
		   if(title.contains("Sign up for X / X")) {
		 	 break;
		     }
		            }
		        			  driver.findElement(By.xpath("//button[text()='Authenticate']")).click();
       				 
     			  }
		     		//      driver.findElement(By.linkText("Authenticate")).click();
  
                 
	
   		  }

