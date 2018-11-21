package costcoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResultPageFromSearchingWater {
	
	WebDriver driver;
	public ResultPageFromSearchingWater(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
