package seleniumElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node09c1elb6tz6nfo5stcpof3dvq234512.node0");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.className("ui-selectonemenu"));
		Select dd = new Select(ele);
		dd.selectByIndex(1);
	}

}
