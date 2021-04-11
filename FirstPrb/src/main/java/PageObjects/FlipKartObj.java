package PageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipKartObj {
	
	WebDriver driver;

	//driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
	
	By dissmiss=By.cssSelector("._2KpZ6l._2doB4z");
	//WebElement searbox=driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@type='text']"));
	//WebElement clickSearch=driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']"));

	public FlipKartObj(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement dissmissLogin()
	{
		return driver.findElement(dissmiss);
	}
	public void searchBook(String book)
	{
		//searbox.click();
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@type='text']")).sendKeys(book);
		driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']")).click();
	}
	public void printlinkcount()
	{
		List<WebElement> linkc=driver.findElements(By.cssSelector(".s1Q9rs"));
		System.out.println("linkcount"+linkc.size());
		
		
		for (int i = 1; i < linkc.size(); i++) {

			String clickonlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			linkc.get(i).sendKeys(clickonlinks);

		}
		Set<String> tabcount = driver.getWindowHandles();
		Iterator<String> it = tabcount.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		
		
		
	}
	
}
