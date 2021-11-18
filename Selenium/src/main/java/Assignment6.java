import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("Ind");
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text = (String)js.executeScript(script);
        System.out.println(text);
        int i=0;
        while(!text.equalsIgnoreCase("India")){
            i++;
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
            text = (String)js.executeScript(script);
            System.out.println(text);
            if (i>10){
                System.out.println("Element not found");
                break;
            }
        }
    }
}
