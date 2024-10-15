package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRAVERSING1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ref_=icp_country_from_us");
		driver.findElement(By.cssSelector("[name='field-keywords']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
//String price=driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Blue'])[1]/../../../../div[@class='puisg-row']//span[@class='a-price-whole']")).getText();
  //  System.out.println(price);
    
    //using following -sibling
//String phoneprice=driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Blue'])[1]/../../../following-sibling::div[@class='puisg-row']//span[@class='a-price-whole']")).getText();
 // System.out.println(phoneprice);
		
		List<WebElement> phoneName = driver.findElements(By.xpath("//span[@class='a-price-whole']/../../../../../../../../../preceding-sibling::div[@data-cy='title-recipe']"));
	
		 for(WebElement PHNAME:phoneName) {
			 System.out.println(PHNAME.getText());
		 }
	}

}
