package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
	
	private static Properties properties;
	
	public static void loadProperties() {
		
		try {
			
			FileInputStream fis = new FileInputStream("src/test/resources/config/runconfig.properties");
			properties = new Properties();
			properties.load(fis);
			fis.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String get(String key) {
		
		return properties.getProperty(key);
	}
	public static int getInt(String key) {
		
		return Integer.parseInt(properties.getProperty(key));
	}
	public static boolean getBoolean(String key) {
		
		return Boolean.parseBoolean(properties.getProperty(key));
	}

}