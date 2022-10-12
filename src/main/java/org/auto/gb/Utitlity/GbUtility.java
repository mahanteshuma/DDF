package org.auto.gb.Utitlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GbUtility {
	
	public static Object fetchproperty(String key) throws IOException {
		FileInputStream file=new FileInputStream("./Config/config.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key);
	}

}
