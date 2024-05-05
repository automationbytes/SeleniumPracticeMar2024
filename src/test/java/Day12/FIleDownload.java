package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Objects;

public class FIleDownload {
    public static void main(String[] args) {


        String path = System.getProperty("user.dir")+"/src/test/java/Day12";
        System.out.println(path);

        HashMap<String, Object> pref = new HashMap<>();
        pref.put("download.default_directory",path);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",pref);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.leafground.com/file.xhtml");

        driver.findElement(By.xpath("//span[text()='Download']")).click();

    }
}
