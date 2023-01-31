package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OrangeHRMproperties {
	
	public static Properties Loadproperty() throws IOException
	{
		
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\LT_HSR\\Akhila\\OrangeHRMApplicationPropertiesfile");
	Properties properties=new Properties();
	properties.load(file);
	return properties;
			
		
			
		
		
		
	}
}
