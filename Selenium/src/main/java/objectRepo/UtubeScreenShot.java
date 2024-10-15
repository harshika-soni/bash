package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UtubeScreenShot {
	
	//initilization
	public UtubeScreenShot(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement searchTextfield;
	
	@FindBy(id="search-icon-legacy")
		private WebElement searchbutton;
	
     @FindBy(xpath="//span[@title='Selenium with Java (Full Crash Course)- 2024 Series']")
	private WebElement vedioImg;
	
	public WebElement getVedioImg() {
		return vedioImg;
	}

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
                         

	
	

}
