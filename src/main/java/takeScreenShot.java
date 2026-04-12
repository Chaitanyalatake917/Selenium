import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class takeScreenShot {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        System.out.println(source);

        File dest=new File("C:\\Users\\chait\\Selenium\\ScreenShots\\amazon.png");
        FileUtils.copyFile(source,dest);
    }
}
