package TestngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(dataProvider="getdata")
	public void Homeloanlogin(String username,String password)
	{
		System.out.println("This is for home loan login");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void carloanlogin()
	{
		System.out.println("This is for car loan login");
	}
	@DataProvider
public Object[][] getdata()
{
	Object[][] data=new Object[2][2];
	data[0][0]="firstuname";
	data[0][1]="firstpassword";
	
	data[1][0]="seconduname";
	data[1][1]="secondpassword";
	
	return data;
	
}
}
