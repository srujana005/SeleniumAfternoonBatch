package practice;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://practice.expandtesting.com/login");
d.manage().window().maximize();
   TakesScreenshot s=(TakesScreenshot)d;
  File f=s.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(f, new File("./login.png"));
	}

}
