package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.cssSelector("#email")).sendKeys("sujji");
		d.findElement(By.cssSelector("#pass")).sendKeys("ssss");
		d.findElement(By.cssSelector("[name='login']")).click();

	}

}
