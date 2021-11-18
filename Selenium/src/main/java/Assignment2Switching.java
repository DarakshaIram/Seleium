import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment2Switching {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        driver.findElement(By.cssSelector("a[target='_blank']")).click();
        Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parentid= it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        driver.switchTo().window(parentid);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
    }
}


