import org.openqa.selenium.chrome.ChromeDriver;

public class basicSelenium {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("Title of current page "+driver.getTitle());
        System.out.println("URL of current page "+driver.getCurrentUrl());
        driver.close();                                                     //used to close only current open window
        driver.quit();                                                      //used to close all opened windows of browser
    }
}