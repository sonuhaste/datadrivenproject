import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pshas\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		driver.get("https://rojgar.mahaswayam.gov.in/#/home/index");
		driver.findElement(By.xpath("//div[@class='modal-body text-center']")).click();
	
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("530C6656522");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sanjay@9696");
		driver.findElement(By.xpath("//*[@id=\"home-tab-multilingual\"]/div/div/section/div[2]/form/div[1]/div[4]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(5000);
		
		
		try {
			driver.findElement(By.xpath("//*[@id=\"pane1\" and @class=\"ng-scope ng-binding\"]")).click();
			Thread.sleep(5000);
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/form/div/div/div/div/table/tbody/tr/td[10]/div/a")).click();
		
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.id("//div[@class='btn-group bootstrap-select vc_skills ng-isolate-scope']"));

		 Select list = new Select(dropdown);

		 java.util.List<WebElement> dropdown_list = list.getOptions();

		 for (int i = 0; i < dropdown_list.size(); i++) {

		   String dropdown_value = dropdown_list.get(i).getText();

		   System.out.println("dropdown values are " + dropdown_value);

		 }
		 
			driver.quit();
		
	}

}
