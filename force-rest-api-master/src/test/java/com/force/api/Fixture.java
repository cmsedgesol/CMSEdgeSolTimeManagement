package com.force.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class Fixture {

	static Properties props;
	/*static {
		InputStream in;
		try {
			in = new FileInputStream(new File("//test.properties"));
			if(in!=null) {
				System.out.println("Setting test config from test.properties resource");
				props = new Properties();
				try {
					props.load(in);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			} else {
				System.out.println("Setting test config from environment");
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}*/
	
	public static String get(String key) {
		
		if(props == null) {
			InputStream in;
			try {
				in = new FileInputStream("test.properties");
				if(in != null) {
					props = new Properties();
					try {
						props.load(in);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if(props!=null) {
			return props.getProperty(key);
		} else {
			return System.getenv(key);
		}
	}

	private static void setFromEnv(Properties props) {
		for(Map.Entry<String,String> entry : System.getenv().entrySet()) {
			if(entry.getKey().startsWith("TEST_")) {
				props.setProperty(entry.getKey().substring(5), entry.getValue());
			}
		}
	}

}
