package web_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestsLoginAndRecover {

    WebDriver driver;

    @Before

    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://auth.hackernoon.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("filipishen@gmail.com");
    }

    @Test

    public void testSuccessfulLoginTest() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("qwerty12345");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        Assert.assertNotNull( driver.findElement(By.className("profile")) );
        Thread.sleep(2000);
    }

    @Test
    public void testErrorPageTest() throws InterruptedException {

        driver.findElement(By.id("password")).sendKeys("qwerty");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertNotNull( driver.findElement(By.className("form-group")) );
    }

    @Test
    public void testRecoverPassword() throws InterruptedException {

        driver.findElement(By.className("recover")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("filipishen@gmail.com");
        Thread.sleep(2000);

    }


    @After
    public void quit(){
        driver.quit();

    }

}
