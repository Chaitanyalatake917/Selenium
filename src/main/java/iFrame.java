import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
        driver.manage().window().maximize();
        Thread.sleep(500);

//        driver.switchTo().frame(0);   //switching to a frame using frame index
//        Thread.sleep(300);
//        System.out.println("Text :"+driver.findElement(By.tagName("h1")).getText());
//        driver.findElement(By.xpath("//a[@class='external-link']")).click();

        driver.switchTo().frame(1);
        Thread.sleep(500);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement element= driver.findElement(By.xpath("//a[@class='external-link']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(300);
//        element.click();

        driver.switchTo().defaultContent(); // used to switch on default/ main webpage
//        driver.switchTo().parentFrame();  // used to switch to parent frame of current frame
        System.out.println(driver.findElement(By.tagName("p")).getText());
    }
}
