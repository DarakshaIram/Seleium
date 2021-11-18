import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

// Enter the letters BENG
// Verify if Airport option is displayed in the suggestive box
public class TrickyAutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        Thread.sleep(2000);
        // System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()); - not possible bcz of hidden element
        //JavaScript DOM can extract hidden elements - bcz selenium cannot identify hidden elements - (Ajax implementation)
        //investigate the properties of object if it have any hidden text
        // JavaScriptExecutor - API - provided by selenium guys to execute all our java script functions
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text = (String) js.executeScript(script);
        System.out.println(text);
        int i=0;
        while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
            if(i>10){
                System.out.println("Element not found");
                break;
            }
        } // change the name and execute- BENGALURU INTERNATION AIRPORT



    }
}
