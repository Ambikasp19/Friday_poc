package stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.qa.util.ConfigReader;
import com.qa.util.Util;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.HomePage;

public class HomePageSteps {

	HomePage homePage;
	WebDriver driver;
	String PRODUCT = "apple iphone 13";
	ConfigReader configReader;
	Properties prop;
	String Actual;
	String Expected;

	@Given("^I launch Chrome Browser$")
	public void i_launch_chrome_browser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@When("User Enter UserName")
	public void user_enter_user_name() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.Enterall_deatails();

	}

	@Given("user is on Home page")
	public void user_is_on_home_page() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.Accept_cookies();
	}

	@When("I click on Next button")
	public void i_click_on_next_button() {
		homePage = new HomePage(driver);
		homePage.Next_Button();
	}

	@When("I click on Search button")
	public void i_click_on_search_button() {
		homePage.Next_Clickonsearch();
	}

	@When("I click on BMW Car")
	public void i_click_on_bmw_car() throws Exception {
		homePage.Click_BMW();
	}

	@When("I select 1er")
	public void i_select_1er() throws InterruptedException {
		homePage.Click_1er();
	}

	@When("I select Cabrio")
	public void i_select_cabrio() throws InterruptedException {
		homePage.All_one();
	}

	@When("I select Benzin")
	public void i_select_benzin() throws InterruptedException {
		homePage.All_one();
	}

	@When("I select 105kw")
	public void i_select_105kw() throws InterruptedException {
		homePage.All_one();
		homePage.All_one();
	}

	@Given("I click on Ford Car")
	public void i_click_on_ford_car() throws InterruptedException {
		homePage.clickonFord();
	}

	@When("I enter Registertion year")
	public void i_enter_registertion_year() throws InterruptedException {
		homePage.Enterall_deatails();
	}

	@When("I select FIESTA84")
	public void i_select_fiesta84() throws InterruptedException {
		homePage.ClickonFIESTA();
	}

	@When("I select Fiesta")
	public void i_select_fiesta() throws InterruptedException {
		homePage.Clickon_Fiesta();
	}

	@When("I select 33kW\\/45PS")
	public void i_select_33k_w_45ps() throws InterruptedException {
		homePage.ClickonKW();
	}

	@Then("I should see DOB Screen")
	public void i_should_see_dob_screen() {
		homePage.Date_birth();
	}
	@When("I click on Audi Car")
	public void i_click_on_audi_car() throws InterruptedException {
		homePage.Click_Audi();
	}
	@When("I select Aone")
	public void i_select_aone() throws InterruptedException {
		homePage.Click_A1();
	}

	@When("I select 60kW\\/82PS")
	public void i_select_60k_w_82ps() throws InterruptedException {
		homePage.Click_KW();

	}

	@When("I select BHL")
	public void i_select_bhl() throws InterruptedException {
		homePage.Click_BHL();
	}
	

}
