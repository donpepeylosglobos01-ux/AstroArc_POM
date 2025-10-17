package AstroArcPOM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base_astro {

	public WebDriver driver; //ESTA VARIABLE LLAMA A NUESTRO DRIVER. LA VARIABLE WEB DRIVER NO TIENE VALOR, POR ESO NO SE PONE. 
	/*public int numero = 18; (formato DE VARIABLE: ACCESO - TIPO - NOMBRE (EL QUE QUIERA) - VALOR DE LA VARIABLE)
	EJEMPLO: private String letras = "gato";*/
	
	public Base_astro (WebDriver driver) { /* acá es otro metodo contructor (por eso lleva el mismo nombre de la clase
	si no seria un metodo normal) impórtante para poder instanciarlo. en este caso sirve para asignarle a la variable driver
	morada el valor de WebDriver*/
	
		this.driver = driver; /*esta igualación le asigna el valor WebDriver a la variable driver(morada) que ha estado viajando
		desde la clase test. la palabra "this" es para indicar que ese "driver" es el de la variable de la linea 8 de esta clase 
		y no otra variable que se llame igual*/
		
	}
	
	public WebDriver chromeDriverConnection() { //conecta el driver que descargamos con el navegador en sí
		
		System.setProperty("webdriver.chrome.driver","./src/webDrivers/chromedriver.exe");
		driver = new ChromeDriver(); //esta linea le asigna a la variable driver la facultad de iniciar chrome
		return driver; //ya una vez asignada la facultad de driver, lo regresa al tipo de la variable		
	}
	
	public void apertura() {
		driver.manage().window().maximize();
		driver.get("https://crypto.shift4.com/demo/space-shop");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public void sendKeys(By locator, String texto) {
		driver.findElement(locator).sendKeys(texto);
	}
	
	public void waiting(int miliseconds) throws InterruptedException {
		Thread.sleep(miliseconds);
	}
	public void switchNewTab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> pestañas = new ArrayList<>(handles);
		driver.switchTo().window(pestañas.get(1)); 
	}
	
	public void scrolling(int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollingOptions(int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"[id=':r3:-listbox']\").scrollBy("+x+","+y+")");
	}
	
	public void switchFrame(int f1) {
		 driver.switchTo().frame(f1);
		
	}
	
	public void frameExpectation1(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String title = driver.findElement(locator).getText();
        Assert.assertEquals(title, "Pay in your wallet", "Text does not match :c");
        System.out.println(title + " is displayed"); 
	}
	
	public void frameExpectation2(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String title2 = driver.findElement(locator).getText();
        Assert.assertEquals(title2, "Log in to your account", "Text does not match :c");
        System.out.println(title2 + " is displayed"); 
	}
	
		
	public void switchNormal() {
		driver.switchTo().defaultContent();
	}
}