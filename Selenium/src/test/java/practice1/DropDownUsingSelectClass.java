package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelectClass {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
           Select sc= new Select(Day);
           sc.selectByVisibleText("15");
           WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
           Select sc1= new Select(month);
           sc1.selectByVisibleText("Mar");
            WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
            Select sc2=new Select(year);
            sc2.selectByVisibleText("2000");
	}

}

