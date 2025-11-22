package weektwo.daytwo.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookChrome {

	public static void main(String[] args) {
		//Initialize Chrome
		ChromeDriver driver = new ChromeDriver();
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		//Maximize
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on the Create new account button
		driver.findElement(By.partialLinkText("Create new account")).click();
		//Enter the First name. - Enter the Surname
		driver.findElement(By.name("firstname")).sendKeys("Test First Name");
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Test Last Name");
		//Day - Drop down -  Select the value from Dropdown
		//Create an object for select class
		//Use the method to select by index
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		daySelect.selectByIndex(0);
		//Month - Drop down -  Select the value from Dropdown.findElement return type is WebElement
		//Create an object for select class
		//Use the method to select by index
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		monthSelect.selectByValue("4");	
		//Year - Drop down -  Select the value from Dropdown.findElement return type is WebElement
		//Create an object for select class
		//Use the method to select by index
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		yearSelect.selectByValue("2000");			
		//Select the radio button in gender
		driver.findElement(By.id("sex")).click();
	}

}

/* Precondition: - Initialize ChromeDriver - Load the URL https://en-gb.facebook.com/ - Maximize the browser window - Add an implicit wait to ensure the web page elements are fully loaded Requirements: - Click on the Create new account button. - 
 * Enter the First name. - Enter the Surname. - Enter the Mobile number or email address. - Enter the New password. - Handle all three dropdowns in Date of birth - Select the radio button in Gender. Hints to Solve: - Use Selenium methods such as get(), manage(), sendKeys(), click() to perform the required actions - Use findElement() to locate a web element - Use Select class to handle the dropdowns and use appropriate methods - Use click() to handle radio buttons Reference Links: Select class - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/Select.html
Expected Outcome: Upon completion, you should be able to:
- Gain proficiency in handling dropdown menus and radio buttons with Selenium WebDriver.
- Automate the process of filling out the Facebook registration form. */