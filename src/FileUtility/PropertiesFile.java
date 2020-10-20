package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties; 

import Keywords.Constants;
/**
 * This method will open ObjectRepository.properties and return value associated with key.
*/	
public class PropertiesFile {
	
	public static String getProperty(String key) {//this method will give string value whatever key we will pass.
		String value=null;
		
		try { 
			Constants.fis=new FileInputStream("Input/ObjectRepository.properties");
			Constants.prop=new Properties(); //we are creating instance of the propertiesfile	 	
			Constants.prop.load(Constants.fis);
			value=Constants.prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open Object Repository");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return key;   		
	}
	public static String getProperty(String key, String filePath) {
		String value=null; 
		try {
			Constants.fis=new FileInputStream("filePath");
			Constants.prop=new Properties(); 
			Constants.prop.load(Constants.fis); 
		} catch (FileNotFoundException e) {
			System.out.println("file "+filePath+" not found");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Unable to load file: "+filePath);
			e.printStackTrace();
			
		}
		return value;	
	}
	public static String[] getLocator(String key) {
		String[] values=null;
		try {
			Constants.fis=new FileInputStream("Input/ObjectRepository.properties");
			Constants.prop=new Properties();
			Constants.prop.load(Constants.fis);
			String part=Constants.prop.getProperty(key); 
			values=part.split("##");
			
		} catch (IOException e) {
			System.out.println("Unable to open Object Repository");
			e.printStackTrace();
		}
		
		return values;
	}
		
	
}
