package Test;

import org.testng.annotations.Test;

import Page.HomepagePage;

public class HomepageTest extends BaseTest{
	@Test
	
	public void PerfomActions() throws InterruptedException
	{
		HomepagePage homepage = new HomepagePage(driver);
		homepage.RevenueCalculator();
		homepage.ScrollDown();
		homepage.Slide();
		homepage.UpdateTextBox();
		homepage.SelectCPTcodes();
		
	}
	
	

}
