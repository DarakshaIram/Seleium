import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EST {
    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://analytics-stream.glu.com/stream#");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("91BFD23F-52F2-4509-A483-1B489315B9F2");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(60000);
        driver.findElement(By.cssSelector("a[download='data.tsv']")).click();
    }
}