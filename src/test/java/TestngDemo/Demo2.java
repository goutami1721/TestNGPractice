package TestngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeTest
	public void demotestfirst()
	{
		System.out.println("This statement is executed before every test");
	}
	@BeforeMethod
	public void demomethodfirst()
	{
		System.out.println("This statement is executed before every method of class demo2");
	}
	@Test(groups= {"smoke"})
	public void mobileloanregister()
	{
		System.out.println("This is for mobile loan register");
	}
	@Test(enabled=false)
	public void mobileloan()
	{
		System.out.println("This is for mobile loan");
	}
	@AfterMethod
	public void demomethodlast()
	{
		System.out.println("This statement is executed after every method of class demo2");
	}
	@AfterTest
	public void demotestlast()
	{
		System.out.println("This statement is executed after every test");
	}

}
