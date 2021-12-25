package com.spp.generics;

import java.io.FileInputStream;
import java.util.Properties;

public abstract class Property {
	
	public static String getPropertyValue(String path,String key) {
		
		String value="";
		
		try {
			
			FileInputStream fs=new FileInputStream(path);
			Properties ppt=new Properties();
			ppt.load(fs);
			value=ppt.getProperty(key);
			
		} catch (Exception e) {
		
		}
		
		
		return value;
	}

}
