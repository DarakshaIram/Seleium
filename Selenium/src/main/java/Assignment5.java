import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Assignment5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement table = driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondrow.get(0).getText());
        System.out.println(secondrow.get(1).getText());
        System.out.println(secondrow.get(2).getText());

    }
}
