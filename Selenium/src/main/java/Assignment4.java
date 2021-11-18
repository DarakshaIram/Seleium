import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.findElement(By.xpath("//a[@href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
        driver.findElement(By.id("checkBoxOption2")).click();
        System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
        String s = driver.findElement(By.cssSelector("label[for='benz']")).getText();
        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select e = new Select(dropdown);
        e.selectByVisibleText(s);
        driver.findElement(By.id("name")).sendKeys(s);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        String text= driver.switchTo().alert().getText();
        if(text.contains(s))
        {
            System.out.println("Success");
        }
        else
            System.out.println("fail");
    }
}
