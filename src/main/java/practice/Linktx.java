package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stube
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Xpath / Css")).click();
		

	}

}
