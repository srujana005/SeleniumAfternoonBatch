package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actin5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://practice.expandtesting.com/horizontal-slider");
		d.manage().window().maximize();
		WebElement ele=d.findElement(By.xpath("//input[@type='range']"));
		Actions a=new Actions(d);
		a.dragAndDropBy(ele, 2, 0).perform();
		

	}

}
