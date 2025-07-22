package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceexpan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://practice.expandtesting.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.linkText("Xpath / Css")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//label[text()='Css']/..//input")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='selector-input']")).sendKeys("//th[text()='Name']/parent::tr");
		//d.findElement(By.xpath("//th[text()='Name']/parent::tr"));

	}

}
