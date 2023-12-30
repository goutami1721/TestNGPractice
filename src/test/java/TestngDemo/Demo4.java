package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Parameters({"URL"})
	@Test
	public void weblogin(String urlname)
	{
	 System.out.println("This is for weblogin");
	 System.out.println(urlname);
	}
	@Parameters({"Username"})
	@Test(dependsOnMethods="weblogin")
	public void mobileloanlogin(String username)
	{
		System.out.println("This is for mobile loan login");
		System.out.println(username);
	}

}
