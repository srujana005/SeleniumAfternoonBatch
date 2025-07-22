package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Proprtyreaing {
	
	public String[] radProp(String Filename,String ...key) throws IOException
	{
		String filepath=System.getProperty("user.dir");
		
		filepath=filepath+"\\src\\main\\java\\xyz\\" +Filename+ ".properties";
		
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		if(key.length>0)
		{
			//for each loop
			
		}
		
		return key;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
