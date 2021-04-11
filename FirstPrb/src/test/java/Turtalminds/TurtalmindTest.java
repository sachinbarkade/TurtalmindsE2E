package Turtalminds;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.TurtlemintPage;
import Resources.Base;

public class TurtalmindTest extends Base{
	@Test
	public void turtalmindsE2EFlow() throws IOException
	{
		driver=initiallzeDriver();
		
		driver.get(prop.getProperty("link"));
		
		TurtlemintPage tp=new TurtlemintPage(driver);
		tp.selectLifeInsurance().click();
		tp.selectTermLifePlan().click();
		String gender="Male";
		if(gender=="Male")
		{
			tp.selectMale().click();
		}
		else
		{
			tp.selectFemale().click();
		}
		//Select DOB
		tp.clickCal().click();//click on calender textbox
		tp.selectYear("1995");
		tp.selectMonth("4");
		tp.selectDay("11");
		 
		String SmokeFlag="True";
		if(SmokeFlag=="True1")
		{
			tp.selectSomkeTrue().click();
		}
		else
		{
			tp.selectSmokeFalse().click();
		}
		//select Annual Income
		//tp.selectIncome().click();
		//tp.SelectIncomeFromDD();
		tp.selectNextButton().click();
		tp.selectNextButton().click();
		tp.enterName().sendKeys("Sachin Barkade");
		tp.enterMobile().sendKeys("9860097324");
		tp.enterEmail().sendKeys("sachin@gmail.com");
		tp.selectNextButton().click();
		System.out.println(driver.getCurrentUrl());
	}
	
}
