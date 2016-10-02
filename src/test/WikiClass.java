package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.Keys;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class WikiClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("My first program");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();


		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		WebElement createBookLink = driver.findElement(By.xpath("//li[@id='coll-create_a_book']//a"));
		createBookLink.click();
		WebElement startbookcreatorbutton = driver.findElement(By.xpath("//button[@class='oo-ui-inputWidget-input oo-ui-buttonElement-button']"));
		startbookcreatorbutton.click();
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='searchInput']"));
		searchbox.sendKeys("Selenium");
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id='searchButton']"));
		searchbutton.click();
		WebElement addpagetobook = driver.findElement(By.xpath("//a[@id='coll-add_article']"));
		addpagetobook.click();
		//Thread.sleep(3000);
		//searchbox.sendKeys("Jscript");
		//searchbutton.click();
		//addpagetobook.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		WebElement showbooklink = driver.findElement(By.xpath("//a[@class='collection-creatorbox-iconlink']"));
		showbooklink.click();
		WebElement entertitle = driver.findElement(By.xpath("//input[@name='collectionTitle']"));
		entertitle.sendKeys("Book Created");
		WebElement entersubtitle = driver.findElement(By.xpath("//input[@name='collectionSubtitle']"));
		entersubtitle.sendKeys("Using Automation");
		WebElement downloadbutton = driver.findElement(By.xpath("//input[@id='downloadButton']"));
		downloadbutton.click();
		//WebElement renderelement = driver.findElement(By.xpath("//input[@id='downloadButton']"));
		if (driver.findElement(By.xpath("//a[@class='external text']")) != null)
		{
			WebElement downloadlink=driver.findElement(By.xpath("//a[@class='external text']"));
			
			//downloadlink.sendKeys(Keys.TAB);
			//downloadlink.sendKeys(Keys.TAB);
			//downloadlink.sendKeys(Keys.ENTER);
			downloadlink.click();
		//Actions action=new Actions(driver);
		//action.sendKeys(Keys.TAB);
		//action.sendKeys(Keys.ENTER);
			Actions action= new Actions(driver);
			//action.sendKeys(Keys.TAB).build().perform();
			//action.sendKeys(Keys.TAB).build().perform();
		//Actions action= new Actions(driver);
		//action.contextClick().build().perform();
		//action.sendKeys(Keys.ARROW_DOWN);
		//action.keyDown(null).perform();
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.sendKeys(Keys.ENTER).build().perform();
		
		action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
			//WebElement embedplugin=driver.findElement(By.xpath("//embed[@type='application/x-google-chrome-pdf']"));
			//embedplugin.click();
			//embedplugin.sendKeys(Keys.chord(Keys.CONTROL,"s"));
			
		}
		
		
	

		
		
		
	}

}
