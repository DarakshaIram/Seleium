import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.*;

public class LeapAssignment {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://leapscholar.com/ielts-preparation-online");
        driver.findElement(By.xpath("//button[contains(text(),'Reserve Free Seat')]")).click();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        String numb = sc.next();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(numb);
        driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();
        Thread.sleep(6000);
        System.out.println("enter OTP: ");
        String otp = sc.next();
        driver.findElement(By.xpath("//input[@placeholder='Enter 6 digit OTP']")).sendKeys(otp);
        driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("field-fullName")).sendKeys("Iram");
        driver.findElement(By.id("field-email")).sendKeys("darakshairam1996@gmail.com");
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[2]/div/div/div/button[1]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[2]/div/div/div/button[2]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[2]/div/div/div/button[3]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[2]/div/div/div/button[4]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[2]/div/div/div/button[5]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[3]/div/div/div/button[1]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[3]/div/div/div/button[2]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[3]/div/div/div/button[3]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[3]/div/div/div/button[4]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[3]/div/div/div/button[5]")).click();
        driver.findElement(By.xpath("//div[@class='py-6 w-full px-4 md:px-8']/form/div[4]/button")).click();

    }

}
