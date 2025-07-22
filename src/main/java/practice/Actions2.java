package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
	WebDriver d;
	Actions a;
	void openBrowser()
	{
	 d=new ChromeDriver();
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		d.manage().window().maximize();
	
		
	}
	void sendData() throws InterruptedException
	{
		d.switchTo().frame("iframeResult");
		a=new Actions(d);
		WebElement e=d.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		//Thread.sleep(5000);
		
		Thread.sleep(5000);
		a.doubleClick(e).perform();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Actions2 a=new Actions2();
		a.openBrowser();
		a.sendData();
		

	}



}
