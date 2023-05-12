package collectionsList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListForAmazon {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/s?k=phone&crid=4P1QGVK2JNSJ&sprefix=pho%2Caps%2C508&ref=nb_sb_noss_2");
		List<WebElement> prize = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < prize.size(); i++) {
			WebElement get = prize.get(i);	
			String text = get.getText();
			System.out.println(text.replace(",",""));
		}

	}

}
