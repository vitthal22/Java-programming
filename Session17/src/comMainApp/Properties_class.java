package comMainApp;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_class {

	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		
		//load file
		
		String path = "C:\\Users\\vitth\\Desktop\\info.properties";
		p.load(new FileInputStream(path));
		
		System.out.println(p.getProperty("user"));
	}

}
