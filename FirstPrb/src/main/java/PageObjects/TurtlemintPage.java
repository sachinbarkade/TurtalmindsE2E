package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TurtlemintPage {
	
public WebDriver driver;
	
	//By signin=By.cssSelector("a[href*='sign_in']");
	By clickLife=By.xpath("//a[@class='quote-cta'][contains(text(),'Life')]");
	By ClickTermLifePlan=By.xpath("//h3[contains(text(), 'Term Life Plans')]");
	By ClickMale=By.cssSelector("#Radio-M");
	By ClickFemale=By.cssSelector("#Radio-F");
	By ClickCalendar=By.xpath("//input[@type='text']");
	By ClickSTT=By.xpath("//label[@id='Radio-true']");
	By ClcikSTF=By.xpath("//label[@id='Radio-false']");
	//By year=By.xpath("//select[@class='sc-iQKALj gwKrYD'][1]");
	By clickOnIncome=By.xpath("//div[@class='sc-eqIVtm cCBzET']");
	By clickNext=By.cssSelector(".sc-kUaPvJ.clcQPd.sc-htoDjs.fldAUc");
	By Name=By.name("customerName");
	By Mobile=By.name("paidUserMobile");
	By Email=By.name("paidUserEmail");
	
	public TurtlemintPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	
	}
	
	public WebElement selectLifeInsurance()
	{
		return driver.findElement(clickLife);
	}
	public WebElement selectTermLifePlan()
	{
		return driver.findElement(ClickTermLifePlan);
	}
	public WebElement selectMale()
	{
		return driver.findElement(ClickMale);
	}
	public WebElement selectFemale()
	{
		return driver.findElement(ClickFemale);
	}
	public WebElement clickCal()
	{
		return driver.findElement(ClickCalendar);
	}
	public void selectYear(String year)
	{
		WebElement ele=driver.findElement(By.xpath("//select[@class='sc-iQKALj gwKrYD'][1]"));
		
		Select dropDown=new Select(ele);
		
		dropDown.selectByValue(year);	
	}
	public void selectMonth(String month)
	{
		WebElement monthEle=driver.findElement(By.xpath("//select[@class='sc-iQKALj gwKrYD'][2]"));
		Select dropDownM=new Select(monthEle);
		dropDownM.selectByValue(month);
	}
	
	public void selectDay(String Day)
	{
		int count=driver.findElements(By.xpath("//div[@role='option']")).size();
		
		for(int i=0; i<count;i++) {
			
			String dateValue=driver.findElements(By.xpath("//div[@role='option']")).get(i).getText();
			if(dateValue.equalsIgnoreCase(Day)) {
				
				driver.findElements(By.xpath("//div[@role='option']")).get(i).click();
				break;

				}

			}
		}
	
	public WebElement selectSomkeTrue()
	{
		return driver.findElement(ClickSTT);
	}
	public WebElement selectSmokeFalse()
	{
		return driver.findElement(ClcikSTF);
	}
	public WebElement selectIncome()
	{
		return driver.findElement(clickOnIncome);
	}
	public void SelectIncomeFromDD()
	{
		//List<WebElement> dropdownItems = driver.findElements(By.xpath("//span[@style=\"white-space: nowrap; overflow: hidden; text-overflow: ellipsis;\"]"));
		//dropdownItems.get(3).click(); // click on first Dropdown, for example
		driver.findElement(By.xpath("//div[@class='sc-eqIVtm cCBzET']")).click();
		String s = ((JavascriptExecutor)driver).executeScript(" return document.getElementById('Id').value").toString();
        System.out.println(s);
	}
	public WebElement selectNextButton()
	{
		return driver.findElement(clickNext);
	}
	public WebElement enterName()
	{
		return driver.findElement(Name);
	}
	public WebElement enterMobile()
	{
		return driver.findElement(Mobile);
	}
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
	}
	}
