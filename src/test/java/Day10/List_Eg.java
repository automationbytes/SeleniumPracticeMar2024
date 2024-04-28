package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class List_Eg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.id("src")).sendKeys("Ba");
        List<WebElement> source = driver.findElements(By.xpath("//ul//text"));
        for (WebElement s : source){
            System.out.println(s.getText());
            if(s.getText().equals("Ballari"))
            {
                s.click();
                break;
            }
        }
    }
}
