package Github;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class GitH {

    public void setUp() throws InterruptedException
    { System.setProperty("webdriver.chrome.driver","Git/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://github.com/login");

        Thread.sleep(8000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("username")).sendKeys("fumz-dev");

        driver.findElement(By.id("pass")).sendKeys("Fop4com8");
        driver.findElement(By.id("Signinbutton")).click(); }

    public static void main(String[] args) throws InterruptedException {
        GitH test = new GitH();
        test.setUp();
    }
}

