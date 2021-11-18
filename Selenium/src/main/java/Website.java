import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Website {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

         if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

            {
                System.out.println("it is disabled");

            }else
            {
                Assert.assertFalse(false);
            }

         Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='row1 adult-infant-child'] //div[@id='divpaxinfo']")).click();
        Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("5");
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000);
        Select i= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        i.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

    }
}
