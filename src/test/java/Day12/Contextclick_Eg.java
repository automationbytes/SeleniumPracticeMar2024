package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
//right click is context click in selenium
public class Contextclick_Eg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
        actions.click(driver.findElement(By.xpath("//span[text()='Edit']")));
        actions.build().perform();

    }
}
