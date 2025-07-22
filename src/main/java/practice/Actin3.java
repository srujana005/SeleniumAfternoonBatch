package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actin3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated methodW
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu_addeventlistener");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
		WebElement ele=d.findElement(By.xpath("//div[@id='div01']/p"));
		
		Actions a=new Actions(d);
		Thread.sleep(3000);
		a.contextClick(ele).perform();
		
		
	}

}
