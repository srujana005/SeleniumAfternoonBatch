package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Follwing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.get("https://practice.expandtesting.com/login");
		d.manage().window().maximize();
		// parent
		d.findElement(By.xpath("//label[@for='username']//parent::div"));

		// child
		d.findElement(By.xpath("//div[@class='mb-3']/child::input")).sendKeys("hi");

		Thread.sleep(5000);

		// precedding::sibling

		d.findElement(By.xpath("//label[@for='password']//preceding::input")).sendKeys("srujana");

		// following-sibling
		d.findElement(By.xpath("//div[@class='mb-3']/label/following-sibling::input")).sendKeys("hello");

		// following
		d.findElement(By.xpath("//label[@for='username']//following::input")).sendKeys("sujji");
		d.findElement(By.xpath("//input[@type='password']/following::button")).click();

	}

}
