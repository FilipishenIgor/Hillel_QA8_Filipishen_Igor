package web_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestsSearch {

    WebDriver driver;

    @Before

    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.bookfinder.com.ua/");
    }

    @Test

    public void testSearchDracula() throws InterruptedException {
        driver.findElement(By.id("searchQuery"));
        driver.findElement(By.id("searchQuery")).clear();
        driver.findElement(By.id("searchQuery")).sendKeys("Dracula");
        Thread.sleep(2000);
        driver.findElement(By.id("searchQuery")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//bookfinder-app//bookfinder-search//search-results/ul[@class='books-list']/li[1]/div[@class='image']/a[@href='https://grenka.ua/204905/dracula?target=bookfinder']/img")).click();
        Thread.sleep(2000);
        ///html/body/bookfinder-app/div/div/bookfinder-search/div[1]/search-results/ul/li[1]/div[1]/a/img


        Assert.assertNotNull(driver.findElement(By.className("books-paging") ));
        System.out.println("---Dracula's search results are shown---");
    }

   // @Test
    public void testSearchTolkien() throws InterruptedException {
        driver.findElement(By.id("searchQuery"));
        driver.findElement(By.id("searchQuery")).clear();
        driver.findElement(By.id("searchQuery")).sendKeys("Tolkien");
        Thread.sleep(2000);
        driver.findElement(By.id("searchQuery")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        Assert.assertNotNull(driver.findElement(By.className("books-paging") ));
        System.out.println("---Tolkien's search results are shown---");
    }

   //@Test
    public void testSearchReturnMainPage() throws InterruptedException {
        driver.findElement(By.id("searchQuery"));
        driver.findElement(By.id("searchQuery")).clear();
        driver.findElement(By.id("searchQuery")).sendKeys("Tolkien");
        Thread.sleep(2000);
        driver.findElement(By.id("searchQuery")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.className("logo-small")).click();
        Thread.sleep(2000);

        Assert.assertNotNull(driver.findElement(By.className("logo") ));
        System.out.println("---Home page shown---");

    }



    @After
    public void quit(){
        driver.quit();

    }
}
