package AstroArcPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_astro extends Base_astro{

	//private WebDriver driver;
	By addcartbtn = By.xpath ("//h2[contains(text(), 'Alpha')]/following::div[contains(@class, 'bg-')][2]"); 
	
	public void addToCart() {
	//driver.findElement(addcartbtn).click();
	}
	
	public Homepage_astro (WebDriver driver) {
	super(driver);	

	
	}
	
	
}
