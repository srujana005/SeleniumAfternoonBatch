package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/TAGs/tryit.asp?filename=tryhtml_select_multiple");
		d.manage().window().maximize();
		d.switchTo().frame("iframeResult");
		WebElement ele=d.findElement(By.id("cars"));
		Select s=new Select(ele);
		List<WebElement>  l1=s.getOptions();
		for(WebElement l2: l1)
		{
			System.out.println(l2.getText());
		}
		if(s.isMultiple())
		{
			s.selectByVisibleText("Audi");
			Thread.sleep(2000);
			s.selectByValue("volvo");
			Thread.sleep(2000);
			List<WebElement> alloptions=s.getAllSelectedOptions();
			for(int i=0;i<alloptions.size();i++)
			{
				String data=alloptions.get(i).getText();
				System.out.println("The expected car is"+data);
			}
			s.deselectByVisibleText("Audi");
			Thread.sleep(2000);
			s.deselectAll();
			
		}
		d.switchTo().parentFrame();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@title='Change Orientation']")).click();
		
		

	}

}
