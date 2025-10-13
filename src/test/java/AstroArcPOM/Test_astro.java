package AstroArcPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import AstroArcPOM.Homepage_astro;

public class Test_astro {

private WebDriver driver;

Homepage_astro hometab;

@BeforeClass
public void start () throws Exception {
	
	
	hometab = new Homepage_astro(driver);
	driver = hometab.chromeDriverConnection();
	//System.setProperty("webdriver.chrome.driver","./src/webDrivers/chromedriver.exe");
	/*driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://crypto.shift4.com/demo/space-shop");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));+*/
	
}

@Test
public void paymentWithCrypto () throws Exception{
	
}

@AfterTest
public void finishMethod () throws Exception {

}
}
