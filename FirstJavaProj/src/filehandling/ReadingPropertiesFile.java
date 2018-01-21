package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		File f = new File("resources/config.properties");
		InputStream is = null;
		try {
			is = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		prop.load(is);
		
		System.out.println(prop.getProperty("place"));

	}

}
