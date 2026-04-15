import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
    }
}
