import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public void mousehover() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samdany\\Desktop\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
         
		//Launch the URL 
		d.get("https://www.spicejet.com/");
		
		// Maxmize the window
		d.manage().window().maximize();
		
		// delete all cookies
		d.manage().deleteAllCookies();
		
		// Dynamic wait
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Instantiating the Action class
		Actions act = new Actions(d);

		// .build()-> return action class object .perform()-> perform the action

		// act.clickAndHold().moveToElement(d.findElement(By.id("elemnt"))).release().build().perform();

		// Locating the addon element move over it and click
		act.moveToElement(d.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();

		//d.findElement(By.linkText("Priority Check-in")).click();

		// Locating the gift card option and perform right click
		WebElement rightclick = d.findElement(By.cssSelector("#highlight-gift-card"));

		act.contextClick(rightclick).build().perform();
		

	}

	public static void main(String[] args) {
		Mouseaction o = new Mouseaction();
		o.mousehover();
	}

}
