package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initiallzeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sachi\\git\\repository\\FirstPrb\\src\\main\\java\\Resources\\Data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(browserName=="firefox")
		{
			
			
		}
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	
	
}
}
