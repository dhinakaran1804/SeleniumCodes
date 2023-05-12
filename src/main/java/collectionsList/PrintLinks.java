package collectionsList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintLinks {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/link.xhtml");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"card\"]//a"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			System.out.println(webElement.getText());			
		}
		driver.close();
	}

}
