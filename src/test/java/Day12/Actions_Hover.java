package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_Hover {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']")));
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Table Fans']")));
        actions.click(driver.findElement(By.xpath("//span[text()='Table Fans']")));
       // actions.build().perform();

    }
}
