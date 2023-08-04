package genericLibraray;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Propertyfile {
	public String getPropertydata(String key) throws Throwable {
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream(IPathConstant.propertyfilepath);
		p.load(fs);
		return p.getProperty(key);
	}

}
