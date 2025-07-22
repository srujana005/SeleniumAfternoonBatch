package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actins {
	
	Actions a;
	WebDriver d;
	void openBrowser()
	{
	 d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
	
		
	}
	void sendData()
	{
		d.switchTo().frame(0);
		a=new Actions(d);
		WebElement ele1=d.findElement(By.id("draggable"));
		WebElement ele2=d.findElement(By.id("droppable"));
		a.dragAndDrop(ele1, ele2).perform();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actins a=new Actins();
		a.openBrowser();
		a.sendData();
		

	}

}
