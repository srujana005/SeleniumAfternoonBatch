package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actin4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover_dom");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
		WebElement ele=d.findElement(By.xpath("//h1[@id='demo']"));
		
		Actions a=new Actions(d);
		Thread.sleep(3000);
		a.moveToElement(ele).perform();

	}

}
