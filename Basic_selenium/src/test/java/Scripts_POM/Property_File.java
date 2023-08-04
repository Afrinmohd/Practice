package Scripts_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Property_File {
	public String getProperty(String key) throws Throwable {
	Properties p=new Properties();
	FileInputStream file=new FileInputStream(".\\src\\test\\resources\\Data.properties");
	p.load(file);
	String value = p.getProperty(key);
	return value;
}
}
