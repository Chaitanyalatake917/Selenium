import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://tickets.paytm.com/bus/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//label[@for='roundtrip']"));
        element.click();
    }
}
