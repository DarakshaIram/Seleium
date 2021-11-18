
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

    public static void main(String[] args) {
        int sum=0;
        System.setProperty("webdriver.chrome.driver", "/Users/daraksha.iram/Downloads/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/26747/nep-vs-oman-4th-match-icc-cricket-world-cup-league-two-2019-22");
        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        for (int i = 0; i < count-2; i++) {
            // System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
            String value= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueinteger = Integer.parseInt(value);
            sum=sum+valueinteger;
        }
        //System.out.println(sum);
        String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int ExtraValue = Integer.parseInt(Extras);
        int Totalvalue= sum+ExtraValue;
        System.out.println(Totalvalue);
        //System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
        // System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int ActualTotalValue=Integer.parseInt(ActualTotal);
        if(ActualTotalValue == Totalvalue)
        {
            System.out.println("Count matches");
        }
        else
        {
            System.out.println("Count fails");
        }
    }
}
