package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");

        String path = System.getProperty("user.dir");
        System.out.println(path);
        //src/test/java/Day12/sample.txt
        driver.findElement(By.id("j_idt88:j_idt89_input")).sendKeys(path+"/src/test/java/Day12/sample.txt");

    }
}
