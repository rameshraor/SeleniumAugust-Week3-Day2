package week3.Day2Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public ChromeDriver ConfigureDriver() {

		// Below are standard steps to be included (except the URL)

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// Step 0-01: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 0-02: Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		// Step 0-03: Load the URL
		driver.get("https://www.ajio.com/");
		// Step 0-04: Maximize the window
		driver.manage().window().maximize();
		// Step 0-05: waits for 10 secs if the element is not in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void main(String[] args) throws InterruptedException {

		Ajio objMyAjioObj = new Ajio();

		// Step 0: Configure the Driver
		ChromeDriver mainDriver = objMyAjioObj.ConfigureDriver();
		Thread.sleep(2000);

		// Step 1: In the search box, type as "bags" and press enter
		WebElement elemSrchBox = mainDriver.findElement(By.xpath("//input[@name='searchVal']"));
		elemSrchBox.clear();
		elemSrchBox.sendKeys("bags");
		Thread.sleep(1000);
		elemSrchBox.sendKeys(Keys.ENTER);
		System.out.println("Entered bags in search box");

		// Step 2: To the left of the screen under " Gender" click the "Men"
		WebElement elemMenChkBox = mainDriver.findElement(By.xpath("//label[@for='Men']"));
		elemMenChkBox.click();
		Thread.sleep(2000);
		System.out.println("Selected Men in the side bar");

		// Step 3: Under "Category" click "Fashion Bags"
		WebElement elemMenFashBagsChkBox = mainDriver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		elemMenFashBagsChkBox.click();
		Thread.sleep(2000);

		// Step 4: Print the count of the items Found.
		WebElement elemNbrItemsFnd = mainDriver.findElement(By.className("length"));
		String nbrItemsFound = elemNbrItemsFnd.getText();
		String itemsCount = nbrItemsFound.replaceAll("\\D", "");
		System.out.println("Count of Men Fashion Bags found is : " + itemsCount);

		// Step 6. Get the list of brand of the products displayed in the page and print
		// the list.
		// Get the brand names to a string array
		List<WebElement> elemLstBrandNames = mainDriver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Total # of Brand names : " + elemLstBrandNames.size());

		List<String> arrlistBrandNames = new ArrayList<String>();
		for (WebElement eachBrandName : elemLstBrandNames) {
			arrlistBrandNames.add(eachBrandName.getText());
		}
		System.out.println("Brand names listed in the site page : " + arrlistBrandNames);

		// Step 7: Get the list of names of the bags and print it
		List<WebElement> elemLstBagNames = mainDriver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("Total Bag names count : " + elemLstBagNames.size());

		List<String> arrlistBagNames = new ArrayList<String>();
		for (WebElement eachBagName : elemLstBagNames) {
			arrlistBagNames.add(eachBagName.getText());
		}
		System.out.println("List of Bag names : " + arrlistBagNames);

	}

}
