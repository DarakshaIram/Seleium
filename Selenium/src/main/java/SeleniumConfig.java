import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;

public class SeleniumConfig {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

    }
}
