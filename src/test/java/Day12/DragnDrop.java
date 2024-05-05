package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragnDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//span[text()='50L']/.."));
        WebElement drop = driver.findElement(By.xpath("//span[text()='150L']/.."));

//        actions.dragAndDrop(drag,drop);
//        actions.build().perform();

        actions.clickAndHold(drag);
        actions.release(drop);
        actions.build().perform();

    }
}
