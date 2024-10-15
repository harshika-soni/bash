package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movie {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.get("file:///C:/Users/HP/Desktop/B.html");
		 //movie collection of kanthara 
 driver.findElement(By.xpath("//td[text()='Kanthara']/../td[text()='10cr']"));
//movie collection of RRR
 driver.findElement(By.xpath("//td[text()='RRR']/../td[3]"));
 //movie collection of KGF2
 driver.findElements(By.xpath("//td[text()='KGF2']/../td[3]"));
 //kanthra to RRR movie collection
 driver.findElements(By.xpath("//td[text()='Kanthara']/../../tr[3]//td[text()='20cr']"));
 //move from kgf2 to kanthara
 driver.findElement(By.xpath("//td[text()='KGF2']/../../tr[1]//td[text()='Kanthara']"));
 //move from RRRmovie collection to KGF2 movie collection
 driver.findElement(By.xpath("//td[text()='20cr']/../../tr[2]//td[text()='25cr']"));
 //to locate a movie collection of Kanthra
 driver.findElement(By.xpath("//td[text()='Kanthara']/following-sibling::td[1]"));
 //x-path to locate a movie collection of RRR
 driver.findElement(By.xpath("//td[text()='RRR']/following-sibling::td[1]"));
 //slno to collection
 driver.findElement(By.xpath("//td[text()='1']/following-sibling::td[text()='10cr']"));
 //write a xpath to locate the serial no of  movie kgf2
 driver.findElement(By.xpath("//td[text()='KGF2']/preceding-sibling::td[1]"));
 //write a xpath to locate the serial no of movie kanthara
 driver.findElement(By.xpath("//td[text()='Kanthara']/preceding-sibling::td[1]"));
	}

}
