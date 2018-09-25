package myMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import myMavenProject.LoginPage;

public class PageFactoryExample {
	public static WebDriver driver;
	LoginPage loginPage;
	//HomePage homePage;
	//CommonPage cmnPage;
	@BeforeMethod
	  public void setUp()
	  {
		  //WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\EclipseMyWorkspace\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://anyaut.com/orange");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }
	
	@Test
	  public void loginActiTimeApp()
	  {
		  //creating loginPage object through page factory 
		loginPage=PageFactory.initElements(driver, LoginPage.class); 
		
		loginPage.validLogin("meenakshivpatil@gmail.com","Test!1234");
		
	
		
		
		//Wait<WebDriver> wait= new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("logout")));
			
			
	  }  
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}

