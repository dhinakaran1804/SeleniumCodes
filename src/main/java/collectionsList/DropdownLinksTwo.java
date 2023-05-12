package collectionsList;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownLinksTwo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/select.xhtml");
		// WebElement drop =
		// driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dd = new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		dd.selectByIndex(2);

//		List<WebElement> list = dd.getOptions();
//		for (WebElement ele : list) {
//			ele.getText();
//			System.out.println(ele);
//		}

	}

}
