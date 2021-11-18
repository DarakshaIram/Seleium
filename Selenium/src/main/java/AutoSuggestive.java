import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.cssSelector("#fromCity")).click();
        WebElement source = driver.findElement(By.cssSelector("[placeholder='From']"));
        source.sendKeys("mum");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);
        source.sendKeys(Keys.ENTER);
        WebElement des= driver.findElement(By.cssSelector("[placeholder='To']"));
        des.sendKeys("che");
        Thread.sleep(2000);
        for (int i = 0; i<3; i++){
            des.sendKeys(Keys.ARROW_DOWN);
        }
        des.sendKeys(Keys.ENTER);
    }
}