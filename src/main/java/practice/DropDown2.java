package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://practice.expandtesting.com/dropdown");

    WebElement ele=driver.findElement(By.id("dropdown"));
    Select s=new Select(ele);
    boolean b=s.isMultiple();
    System.out.println(b);
 
	if(s.isMultiple())
	{
		System.out.println("true");
		s.selectByValue("AF");
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByVisibleText("American Samoa");
	}
	}
	

}
// List<WebElement> l=s.getOptions();
	/*
	 * for(WebElement drop:l) { System.out.println(drop.getText()); }
	 */
/*
 * driver.findElement(By.xpath("//a[@id='examples-dropdown']")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[text()='APIs']")).click();
 */