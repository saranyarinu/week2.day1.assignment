package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Launch the Browser(chrome)
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout=driver.findElement(By.className("decorativeSubmit"));
		
		String attribute = logout.getAttribute("value");
		if(attribute.equals("Logout")) {
		System.out.println("Successfully Logged In");
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Riya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Analyst(IT)");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf is best to learn Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranyarinu1991@gmail.com");
		
		WebElement dropdown1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(dropdown1);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}
		
	}

	
}
