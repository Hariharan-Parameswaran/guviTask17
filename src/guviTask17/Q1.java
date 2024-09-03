package guviTask17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {

		// Open the Chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Set an implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigate to the website
		driver.get("https://www.demoblaze.com/");

		// Find the Log In button by its ID and move the cursor over it
		WebElement loginButton = driver.findElement(By.id("login2"));
		Actions action = new Actions(driver);
		action.moveToElement(loginButton).perform();
		// Click on the Log In button
		loginButton.click();

		// Enter a valid username in the username field
		WebElement userName = driver.findElement(By.id("loginusername"));
		userName.sendKeys("hariharan Paramewan");

		// Enter a valid password in the password field
		WebElement userPassword = driver.findElement(By.id("loginpassword"));
		userPassword.sendKeys("harifz7581");

		// Click on the Login button
		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(.,'Log in')]"));
		LoginButton.click();

		// Wait for 2 seconds
		Thread.sleep(2000);

		// Locate the element that displays the username after successful login
		WebElement verifyMessage = driver.findElement(By.id("nameofuser"));

		// Print the Verification message in the console
		if (verifyMessage.isDisplayed()) {
			System.out.println("login Successfully message : " + verifyMessage.getText());
		} else {
			System.out.println("Login Failed");
		}
	}

}


// Output :
//	 login Successfully message : Welcome hariharan Paramewan