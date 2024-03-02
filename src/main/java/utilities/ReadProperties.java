package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties 
{
	
	public static String readPropertiesData(String key) throws Exception
	{
		String path = "./src/main/resources/data.properties";
		
		FileInputStream file = new FileInputStream(path);	//handle external file
		
		Properties prop = new Properties();
		prop.load(file);									//to load/open a file
		
		String property = prop.getProperty(key);			//call the key, it will return its value
		
		System.out.println(property);
		
		return property;
		
	}

}
