import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertionEx {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String s1=driver.getTitle();
        driver.navigate().to("https://www.amazon.in/amazonpay/home");
        String s2=driver.getTitle();

        Assert.assertNotEquals(s1,s2);

//        Assert.assertEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();
//        Assert.assertNull();
    }
}
