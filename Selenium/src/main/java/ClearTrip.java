import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        driver.findElement(By.cssSelector("input[class='depart_date keyValue span span24 required hasDatepicker placeholder']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
        Select s=new Select(driver.findElement(By.id("Adults")));
        s.selectByIndex(3);
        Select c=new Select(driver.findElement(By.id("Childrens")));
        c.selectByIndex(2);
        Select i=new Select(driver.findElement(By.id("Infants")));
        i.selectByIndex(1);
        driver.findElement(By.cssSelector("i[class='rArrow blue']")).click();
        WebElement source = driver.findElement(By.id("AirlineAutocomplete"));
        source.sendKeys("indig");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("SearchBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

    }
}
