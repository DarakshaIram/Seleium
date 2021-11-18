import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;


public class ChildWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://support.google.com/accounts/answer/27441?hl=en");
        driver.findElement(By.cssSelector("a[rel='noopener']")).click();
        System.out.println("Before switching");
        System.out.println(driver.getTitle());
        Set<String> ids=driver.getWindowHandles(); // list data structure
        Iterator<String> it=ids.iterator(); // traverse through the windows
        String parentid= it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println("After switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println("switching Back to parent");
        System.out.println(driver.getTitle());

    }
}
