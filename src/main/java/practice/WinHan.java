package practice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHan {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://phptravels.com/");
		d.manage().window().maximize();

		// Store main window
		String mainWindow = d.getWindowHandle();
		System.out.println("Main Window: " + mainWindow);

		// Click Sign Up (it opens new window)
		d.findElement(By.xpath("//strong[text()='Sign Up']")).click();
		Thread.sleep(3000); // Wait for new window to open

		// Click Login (also opens new window)
		d.switchTo().window(mainWindow);
		d.findElement(By.xpath("//strong[text()='Login']")).click();
		Thread.sleep(3000); // Wait for login window

		// Get all window handles
		Set<String> allWindows = d.getWindowHandles();

		// Loop through each window
		for (String win : allWindows) {
			d.switchTo().window(win);
			String title = d.getTitle();
			System.out.println("Window Title: " + title);

			if (title.contains("Signup")) {
				// Interact with Signup window
				try {
					d.findElement(By.id("email")).sendKeys("srujana");
					d.findElement(By.id("password")).sendKeys("sujji");
				} catch (Exception e) {
					System.out.println("Error in Signup window: " + e.getMessage());
				}
				
				d.close();
			}

			if (title.contains("Login")) {
				// Interact with Login window
				try {
					d.findElement(By.id("email")).sendKeys("sujji");
					d.findElement(By.id("password")).sendKeys("sujji");
					d.findElement(By.xpath("//button[@id='submit']")).click();
				} catch (Exception e) {
					System.out.println("Error in Login window: " + e.getMessage());
				}
			}
		}

		
		 d.quit();
	}
}
