package AstroArcPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class paymentPage extends Base_astro{

	By more = By.xpath("//button[contains(@class, 'css-19ly2jv')]");
	By allTab =By.xpath("//button[normalize-space(.)= 'All']");
	By exchangesTab =By.xpath("//button[normalize-space(.)= 'Exchanges']");
	By walletsTab =By.xpath("//button[normalize-space(.)= 'Wallets']");
	
	By metamask = By.xpath("//li[contains(@id, ':r3:-option-2')]");
	
	By frame1 = By.xpath("//*[@id=\"mesh-link-popup__iframe\"]");
	By frametitle1 =By.xpath("//h1[contains(@class, 'h4-')]");
	By equis = By.xpath("//button[contains(@class, 'cursor-pointer absolute r')]");
	By exit=By.xpath("//button[text()='Yes, exit']");
	
	By continuebtn=By.xpath("//button[text()='Continue Payment']");
	By paycoinbase=By.xpath("//button[normalize-space(.)='Pay with Coinbase']");
	
	By frametitle2 =By.xpath("//h1[contains(@class, 'h')]");
	
	public paymentPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void criptotype() throws InterruptedException {
		switchNewTab();
		click(more);
		Thread.sleep(1000);
		scrolling(0,200);
			waiting(1000);
		scrolling(0,-200);
			waiting(1000);
		scrollingOptions(0,500);
			waiting(1000);
		scrollingOptions(0,-200);
			waiting(1000);
		scrollingOptions(0,-300);
			waiting(1000);
		
		click(exchangesTab);
			waiting(2000);
		click(walletsTab);
			waiting(2000);
		click(allTab);
			waiting(2000);
	}
	
	public void paymentSelection() throws InterruptedException {
		click(metamask);
			waiting(5000);
		
		switchFrame(0);   
		frameExpectation1(frametitle1);
			waiting(2000);
		click(equis);
		click(exit);
		switchNormal();
			waiting(2000);
		click(continuebtn);
		click(paycoinbase);
			waiting(5000);
		switchFrame(0); 
		frameExpectation2(frametitle2);
			waiting(2000);
		click(equis);
		click(exit);
		switchNormal();
		waiting(3000);
		
	}
	
}
