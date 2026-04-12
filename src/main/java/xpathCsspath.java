import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCsspath {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_help']")).click();
        Thread.sleep(200);
        driver.navigate().to("https://npublic.msrtcors.com/reservation-home?faces-redirect=true&deviceType=browser");
        driver.findElement(By.cssSelector("span.ui-button-text")).click();
    }
}
