package stepFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import costcoPages.HomePage;
import costcoPages.ResultPageFromSearchingWater;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Base;

public class BuyKirklandWaterSteps {
	
	
	HomePage homePage;
	ResultPageFromSearchingWater resultPageFromSearchingWater; 
	@Given("^user opened browser and navigate to costco homepage$")
	public void user_opened_browser_and_navigate_to_costco_homepage() throws Throwable {
		Base.getDriver();
		Base.gotoPage();
		
	}

	@When("^user search kirkland water on search and hit enter$")
	public void user_search_kirkland_water_on_search_and_hit_enter() throws Throwable {
		homePage = new HomePage(Base.getDriver());
		resultPageFromSearchingWater = homePage.searchsth();
	}

	@Then("^User land on kirkland result page$")
	public void user_land_on_kirkland_result_page() throws Throwable {
	   
	}


}
