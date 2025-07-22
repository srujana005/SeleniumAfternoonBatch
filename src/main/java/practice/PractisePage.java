package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractisePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		 driver.switchTo().frame(0);
		
		 String text=driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
		 System.out.println(text);
		 
		driver.switchTo().parentFrame();
		 driver.findElement(By.linkText("Droppable")).click();
		

	}

}
