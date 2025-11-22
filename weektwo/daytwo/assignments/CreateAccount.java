package weektwo.daytwo.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		//1 Initialize Chrome
		ChromeDriver driver = new ChromeDriver(options);
		//2 Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//3 Maximize window
		driver.manage().window().maximize();
		//4 Enter username
		driver.findElement(By.id("username")).sendKeys("democsr");
		//5 Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//6 Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//7 Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//8 Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		//9 Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//10 Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Siva Test");
		//11 Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//12 Select "ComputerSoftware" as the industry
		//12.1 Select the value from dropdown
		//12.1 find element and assign the variable "industryDropDown"
		WebElement industryDropDown = driver.findElement(By.name("industryEnumId"));
		//12.2 create object - Pass the variable
		Select indDropDown = new Select(industryDropDown);
		//12.3 --------------
		indDropDown.selectByValue("IND_SOFTWARE");		
		//13 Select "S-Corporation" as ownership using SelectByVisibleText
		//13.1 Select the value from dropdown
		//13.1 find element and assign the local variable -Ctrl 2 L "ownershipDropDown"
		WebElement ownershipDropDown = driver.findElement(By.name("ownershipEnumId"));
		//13.2 create object - pass the variable
		Select ownersDropDown = new Select(ownershipDropDown);
		//13.3 -----------
		ownersDropDown.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue
		WebElement sourceDropDown = driver.findElement(By.id("dataSourceId"));
		Select sourDropDown = new Select(sourceDropDown);
		sourDropDown.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select markCampaign = new Select(marketingCampaign);
		markCampaign.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue
		WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select staProvince = new Select(stateProvince);
		staProvince.selectByValue("TX");
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the account name is displayed correctly
		//Close - Close the current window & Quit - Close all the windows
		driver.close();
	}
}
