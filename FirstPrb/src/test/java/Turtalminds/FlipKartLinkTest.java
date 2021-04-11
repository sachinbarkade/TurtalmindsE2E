package Turtalminds;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.FlipKartObj;
import Resources.Base;

public class FlipKartLinkTest extends Base{
	@Test
	public void flipCartLink() throws IOException
	{
		driver=initiallzeDriver();
		
		driver.get(prop.getProperty("flipkartlink"));
		
		FlipKartObj fko=new FlipKartObj(driver);
		fko.dissmissLogin().click();
		fko.searchBook("book");
		fko.printlinkcount();
	}
}
