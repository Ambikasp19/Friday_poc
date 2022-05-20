package pageobjects;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.qa.util.ConfigReader;
import com.qa.util.Util;

public class HomePage {
	WebDriver driver;

	Util util;
	ConfigReader configReader;
	Properties prop;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='chakra-button css-j2b09t']")
	WebElement NextButton;

	@FindBy(xpath = "//*[@name='list']")
	WebElement Clickonsearch;

	@FindBy(xpath = "(//*[text()='BMW'])[2]")
	WebElement ClickonBmw;

	@FindBy(xpath = "//*[text()='1er']")
	WebElement Clickon1er;

	@FindBy(xpath = "(//*[@class='SingleClickListField__buttonLabel--EHIjf'])[1]")
	WebElement ClickonAllinone;

	@FindBy(xpath = "//*[@name='monthYearFirstRegistered']")
	WebElement RegisterYear;

	@FindBy(xpath = "(//*[text()='FORD'])[1]")
	WebElement ClickonFord;

	@FindBy(xpath = "//*[text()='Fiesta']")
	WebElement ClickonFiesta;

	@FindBy(xpath = "//*[text()='33 kW / 45 PS']")
	WebElement ClickonKW;
	
	@FindBy(xpath = "//*[text()='FIESTA 84']")
	WebElement ClickonFIESTA;
	
	@FindBy(xpath = "//*[text()='Wann wurdest du geboren?']")
	WebElement DOB;
	
	@FindBy(xpath = "//*[text()='AUDI']")
	WebElement AUDI;
	
	@FindBy(xpath = "//*[text()='A1']")
	WebElement A1;
	
	@FindBy(xpath = "//*[text()='60 kW / 82 PS']")
	WebElement KW;
	
	@FindBy(xpath = "//*[text()='HSN: 0588, TSN: BHL']")
	WebElement BHL;
	
	
	
	public void Next_Clickonsearch() {
		Clickonsearch.click();
	}

	public void Click_BMW() throws InterruptedException {
		util = new Util();
		util.pause();
		ClickonBmw.click();
	}

	public void Click_1er() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Clickon1er.click();
	}

	public void Accept_cookies() throws InterruptedException {
		// shadowDom element
		util = new Util();
		util.pause();
		String str = "return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"#uc-center-container > div.sc-ikJyIC.itarl > div > div > div > button.sc-gsDKAQ.hWjjep\")";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowRoot = (WebElement) js.executeScript(str);
		shadowRoot.click();
	}

	public void Enterall_deatails() throws InterruptedException {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		util = new Util();
		util.pause();
		RegisterYear.sendKeys(prop.getProperty("RY"));

	}

	public void All_one() throws InterruptedException {
		util = new Util();
		util.pause();
		ClickonAllinone.click();
	}
	
	public void Click_BHL() throws InterruptedException
	{
		util = new Util();
		util.pause();
		BHL.click();
		
	}
	public void Click_KW() throws InterruptedException
	{
		util = new Util();
		util.pause();
		KW.click();
		
	}
	public void Click_Audi() throws InterruptedException
	{
		util = new Util();
		util.pause();
		AUDI.click();
		
	}
	public void Click_A1() throws InterruptedException
	{
		util = new Util();
		util.pause();
		A1.click();
		
	}

	public void Date_birth()
	{
		DOB.isDisplayed();
		
	}
	public void ClickonFIESTA() throws InterruptedException {
		util = new Util();
		util.pause();
		ClickonFIESTA.click();
	}

	public void clickonFord() throws InterruptedException {
		util = new Util();
		util.pause();
		ClickonFord.click();
	}

	public void Next_Button() {
		NextButton.click();
	}

	public void ClickonKW() throws InterruptedException {
		util = new Util();
		util.pause();
		ClickonKW.click();
	}

	public void Clickon_Fiesta() throws InterruptedException {
		util = new Util();
		util.pause();
		ClickonFiesta.click();
	}

	

}
