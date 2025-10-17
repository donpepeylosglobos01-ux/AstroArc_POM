package AstroArcPOM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_astro {

private WebDriver driver;

Homepage_astro hometab; //ESTO ES INSTANCIACIÓN. FORMATO: CLASE - variable ("APODO")

@BeforeClass
public void start () throws Exception {
	driver = Homepage_astro.startChrome();
	hometab = new Homepage_astro(driver); /*Esto es un metodo especial llamado CONSTRUCTOR PARA CREAR UN OBJETO "DRIVER"
	QUE SIRVE PARA INICIARLA EL CHROMEDRIVER Y MANDARLA A HOMEPAGE*/
	
	hometab.apertura();
}

@Test
public void paymentWithCrypto () throws Exception{
	hometab.addToCart();
	paymentPage paymentTab = new paymentPage(driver); /*Otra forma de instanciar una clase, creando el objeto en una
	sola línea desde el apartado test. es lo mismo como se instanció home tab, pero en una sola linea*/
	paymentTab.criptotype(); /*la variable de la clase instanciada es amarilla porque solo aplica para este método, 
	cuando está enazul es que aplica a toda esta clase*/
	paymentTab.paymentSelection();
}

@AfterTest
public void finishMethod () throws Exception {
	driver. quit();
}
}
