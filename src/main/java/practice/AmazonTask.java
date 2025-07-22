package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.navigate().refresh();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone");
		Thread.sleep(2000);
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		WebElement ele=d.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Blue'])[1]"));
		
		ele.click();
				
			
		
		Thread.sleep(3000);
		d.findElement(By.xpath("(//input[@value='Add to Cart'])[2]")).click();
	}
	

}
