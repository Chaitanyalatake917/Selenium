import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assignment3 {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement close=driver.findElement(By.cssSelector("span.commonModal__close"));
        close.click();
    }
}
