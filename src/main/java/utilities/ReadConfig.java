package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	private static Properties prop=null;
	private ReadConfig() {}
	
	public static Properties getPropFile() throws IOException {
		if(prop==null) {
			FileInputStream file = new FileInputStream("config.properties");
			prop = new Properties();
			prop.load(file);
			return prop;
			
			
		}
		
		else
			return prop;
	}
	

}
