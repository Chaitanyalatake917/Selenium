import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class assignment2 {
    public static void main(String[] args) throws Exception{

        ChromeDriver driver=new ChromeDriver();
        String src="https://www.makemytrip.com/";
        driver.get(src);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement close=driver.findElement(By.cssSelector("span.commonModal__close"));

        wait.until(ExpectedConditions.elementToBeClickable(close));
        close.click();

        driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/railways/']")).click();
        String dest=driver.getCurrentUrl();

        Assert.assertNotEquals(src,dest);
        System.out.println("You have clicked a button");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);

        File destination=new File("C:\\Users\\chait\\Selenium\\ScreenShots\\assignment3.png");
        FileUtils.copyFile(source,destination);
    }
}
