package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WinHand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.openmultipleurl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.id("list_urls")).sendKeys("https://www.google.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("list_urls")).sendKeys("https://www.bing.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);


    }
}
