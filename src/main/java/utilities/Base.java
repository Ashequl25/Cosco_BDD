package utilities;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	private static WebDriver driver = null;
	private static Properties prop=null;
	private Base() {
	}

	public static WebDriver getDriver() throws Exception {
		prop = ReadConfig.getPropFile();
		if (driver == null) {

			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
				return driver;
			}

			else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				return driver;
			}
		}
		return driver;

	}
	
	public static void gotoPage() {
		driver.get(prop.getProperty("url"));
	}
}
