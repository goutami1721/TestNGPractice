package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeSuite
	public void demosuitefirst()
	{
		System.out.println("This statement is executed First in suite");
	}
	@BeforeClass
	public void democlassfirst()
	{
		System.out.println("This statement is executed before every test of class demo1");
	}
	@Test(groups= {"smoke"})
	public void Homeloanregister()
	{
		System.out.println("This is for Homeloan register");
	}
	@Test
	public void Homeloan()
	{
		System.out.println("This is for Homeloan");
	}
	@Test(groups= {"paralleldemo"})
	public void openweb1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test(groups={"smoke"})
	public void Carloanregister()
	{
		System.out.println("This is for Carloan register");
	}
	@Test
	public void Carloan()
	{
		System.out.println("This is for Carloan");
	}
	@AfterClass
	public void democlasslast()
	{
		System.out.println("This statement is executed after every test of class demo1");
	}
	@AfterSuite
	public void demosuitelast()
	{
		System.out.println("This statement is executed last in suite");
	}
	
}
