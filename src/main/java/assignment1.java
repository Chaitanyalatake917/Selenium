import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class assignment1 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mrf cricket bat");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).click();

        List<WebElement> ls=driver.findElements(By.xpath("//div[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS-')]"));
        System.out.println("No of results on first page "+ls.size());

        Thread.sleep(500);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath("(//span[contains(text(),'mrf')])[2]"));
        jse.executeScript("arguments[0].scrollIntoView(true);",element);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);

        File dest=new File("C:\\Users\\chait\\Selenium\\ScreenShots\\amazon1.png");
        FileUtils.copyFile(src,dest);
    }
}
