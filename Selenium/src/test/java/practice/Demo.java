package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	 driver.get("https://www.meesho.com/dresses-women/pl/3j3");
	     String url = driver.getCurrentUrl();
	     System.out.println(url);
	     
	     String source = driver.getPageSource();
	     System.out.println(source);
	     
	     System.out.println("Title:"+driver.getTitle());
	     
	     driver.navigate().back();
	     driver.navigate().refresh();
	     

	}

}
