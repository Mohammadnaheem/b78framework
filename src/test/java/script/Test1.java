package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.Demopage;

public class Test1 extends BaseTest{

	@Test
	public void test1()
	{
		String un=Excel.getCellData(XL_PATH,"test1",1,0);
		Reporter.log(un,true);
		Reporter.log("test1...",true);
		Demopage d=new Demopage(driver);
		d.setUserName(un);
	}
}
