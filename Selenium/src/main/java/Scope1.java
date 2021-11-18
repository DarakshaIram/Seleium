import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

// open the separate tabs

public class Scope1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.findElement(By.xpath("//a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();

        // driver.findElement(By.className("blinkingText")).click();
        System.out.println(driver.findElements(By.tagName("a")).size()); // count of the links
        WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        // coloumn scope in footer section
        WebElement coloumndriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());

       // click on each link in the coloumn and check if the page are opening
        for(int i=1; i<coloumndriver.findElements(By.tagName("a")).size(); i++) {
            String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            // driver.navigate().back();
            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000);
        } //opens all the tabs
            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();

            while (it.hasNext()) {
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

    }
}
