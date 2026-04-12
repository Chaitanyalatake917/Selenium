import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@type='checkbox'][contains(@id,'c_bs_')]")).click();
    }
}
