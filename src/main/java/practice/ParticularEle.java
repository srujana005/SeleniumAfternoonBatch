package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularEle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://practice.expandtesting.com/login");
		d.manage().window().maximize();
		
		WebElement ele=d.findElement(By.xpath("//div[@class='card-body']"));
		File s=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("./ele.png"));

	}

}
