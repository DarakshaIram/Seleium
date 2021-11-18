import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certifications {
    public static void main(String args[]){
        //SSl certificates
        //Desired capabilities=
        //general chrome profile
        DesiredCapabilities ch= DesiredCapabilities.chrome();
        // ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //Belongs to your local browser
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(c);
    }
}
