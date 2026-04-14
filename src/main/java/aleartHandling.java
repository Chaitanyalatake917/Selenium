import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class aleartHandling {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.findElement(By.xpath("//button[text()='Alert']")).click();
        Thread.sleep(300);
        driver.switchTo().alert().accept();

        Thread.sleep(300);
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        Thread.sleep(5001);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        Thread.sleep(300);
        driver.findElement(By.xpath("(//button[text()='Click Me'])[3]")).click();
        Thread.sleep(300);
        driver.switchTo().alert().sendKeys("Hello Chaitanya");
        driver.switchTo().alert().dismiss();
    }
}
