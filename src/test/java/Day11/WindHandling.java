package Day11;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindHandling {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.linkText("Instagram")).click();
        driver.findElement(By.linkText("Meta Quest")).click();
        driver.findElement(By.linkText("Meta Store")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        String ParentWindow = driver.getWindowHandle(); //pid
        Set<String> allOpenWindow = driver.getWindowHandles();//all open windows pids it includes parent window
        System.out.println("ParentWindow - "+ ParentWindow);
        System.out.println("All Open Windows - "+ allOpenWindow);

        for (String a : allOpenWindow){
            if(!a.equals(ParentWindow)){
                driver.switchTo().window(a);
                //Thread.sleep(5000);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                if(driver.getTitle().equals("Instagram")){
                    driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]")).sendKeys("Hrllo");
                }
                else {
                    driver.close();
                }
            }
        }

       // driver.switchTo().window(ParentWindow);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("email")).sendKeys("Facebook");



    }
}
