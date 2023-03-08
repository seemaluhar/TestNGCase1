package TestNG_Case1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;
    @Test(priority=1)
    void openBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    @Test(priority=2)
    void login(){
        System.out.println("click on login");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Software_gmail.com");
        driver.findElement(By.name("Password")).sendKeys("test333");
        driver.findElement(By.className("button-1 login-button")).click();

    }


}
