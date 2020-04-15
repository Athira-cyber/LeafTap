package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\SeleniumPrograms\\leafTap\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement fn = driver.findElement(By.xpath("//input[@id='username']"));
		fn.sendKeys("Demosalesmanager");
		WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
		pw.sendKeys("crmsfa");
		WebElement sub1 = driver.findElement(By.xpath("//p/input[@type='submit']"));
		sub1.click();
		WebElement icon = driver.findElement(By.xpath("//a/img"));
		icon.click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//WebElement aname = driver.findElement(By.xpath("//td/input[@id='accountName']"));
		//aname.sendKeys("Admin300");
		WebElement ph = driver.findElement(By.xpath("//td/input[@id='primaryPhoneNumber']"));
		ph.sendKeys("9876543210");
		
		WebElement dropdown = driver.findElement(By.name("industryEnumId"));
		dropdown.sendKeys("Finance");
		
		WebElement initial = driver.findElement(By.name("initialTeamPartyId"));
		Select dd3= new Select(initial);
		dd3.selectByValue("DemoSalesTeam2");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd1 = new Select(ownership);
		dd1.selectByIndex(1);
		
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select dd2= new Select(source);
		dd2.selectByVisibleText("Conference");
		
		WebElement sub2 = driver.findElement(By.xpath("//td/input[@type='submit']"));
		sub2.click();
		

	}

}
