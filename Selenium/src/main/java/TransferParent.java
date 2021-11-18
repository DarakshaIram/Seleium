import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferParent {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/interview.php");

        System.out.println(driver.findElement(By.xpath("//ul[@role='tablist']/parent::div")).getAttribute("class"));
    }
}
