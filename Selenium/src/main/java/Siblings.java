import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/interview.php");
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
       /* driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
        driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
        driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
        driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click(); */
    }
}
