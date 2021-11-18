import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
         public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            System.out.println(driver.getTitle());
             System.out.println(driver.getCurrentUrl());
             driver.findElement(By.cssSelector("input[class='inputtext login_form_input_box']")).sendKeys("Alhamdurillah");
             driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("ghsh");
             driver.findElement(By.cssSelector("input[value='Log In']")).click();
             System.out.println(driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText());
             // driver.findElement(By.linkText("Forgotten account?")).click();
             // driver.close();

         }
    }

