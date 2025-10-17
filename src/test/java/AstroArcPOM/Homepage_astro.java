package AstroArcPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_astro extends Base_astro{

	//private WebDriver driver;

	By addcartbtn = By.xpath ("//h2[contains(text(), 'Alpha')]/following::div[contains(@class, 'bg-')][2]"); 
	By cart = By.xpath("//div[normalize-space(.)='Cart']");
		
	By FirstN = By.xpath("//input[contains(@placeholder, 'First')]");
	By LastN = By.xpath("//input[contains(@placeholder, 'Last')]");
	By Email = By.xpath("//input[contains(@placeholder, 'Email')]");
	By PAY = By.xpath("//span[normalize-space(.)= 'Pay With Crypto']");
			
	public Homepage_astro (WebDriver driver) { //"drive" recibe de clase "test"
	super(driver);	/*SUPER significa que ejecutará un método de la clase padre (base_astro) la cual se llama igual. 
	manda el valor de "driver" (la cual sigue valiendo nulo desde que partio de test). cuando llega a la clase "base_astro"
	se ejecuta el metodo con el mismo nombre, el cual le va dar a este "driver nulo" el valor de la variable driver (azul) la
	cual construimos en la primer linea de la clase padre para iniciar el chrome driver. este constructor siver para poder
	instanciar esta clase, y para ejecutar el base_astro*/
	
	}
	
	public void addToCart() {
		click(addcartbtn);
		click(cart);
		sendKeys(FirstN,"roberto");
		sendKeys(LastN,"Fuentes");
		sendKeys(Email,"ggbfdfv@bamsrad.com");
		click(PAY);
		
		}
	
}
