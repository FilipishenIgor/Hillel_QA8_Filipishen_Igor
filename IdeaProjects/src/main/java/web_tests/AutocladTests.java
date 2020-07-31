package web_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocladTests {

    WebDriver driver;

    @Before

    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.autoklad.ua/");
    }

    @Test

    public void LoginSuccessTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]/span[@class='uk-visible@s']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='login']")).sendKeys("0949975779");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys("666999333igor");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]") ));
        System.out.println("---Login completed---");
    }

    @Test

    public void LoginErrorTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]/span[@class='uk-visible@s']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='login']")).sendKeys("0949975779");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys("666999333");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html//h3[@id='popup_caption_message']")));
        System.out.println("---Login error popup shown---");

    }

    @Test

    public void LogOutTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]/span[@class='uk-visible@s']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='login']")).sendKeys("0949975779");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys("666999333igor");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/div[3]/div/ul[2]//a[@href='/?action=user_logout']")).click();
        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]/span[@class='uk-visible@s']") ));
        System.out.println("---Logout completed---");
    }


        @Test
        public void ChooseCarTestFordMondeo() throws InterruptedException {
        driver.findElement(By.xpath("/html//div[@id='home_brands']/div/div[3]/div[17]/a[@href='/cars/ford/']//div[@class='o-padding-card-catalog']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/div[@class='uk-grid']/div[2]/ul[@class='o-first_block uk-padding-remove-left']//a[@href='/cars/ford/mondeo/']")).click();
        Thread.sleep(3000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[4]/div[4]//h1[@class='o-section-title o-title-indent']") ));
        System.out.println("---Parts for FORD Mondeo shown---");
    }

    @Test
    public void ChooseBatteryTestFordMondeo() throws InterruptedException {
        driver.findElement(By.xpath("/html//div[@id='home_brands']/div/div[3]/div[17]/a[@href='/cars/ford/']//div[@class='o-padding-card-catalog']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/div[@class='uk-grid']/div[2]/ul[@class='o-first_block uk-padding-remove-left']//a[@href='/cars/ford/mondeo/']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[4]//div[@class='uk-grid']/div[1]/ul[@class='o-first_block uk-padding-remove-left']//a[@href='/cars/ford/mondeo/akkumulyator/']")).click();
        Thread.sleep(2000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html//div[@id='table_div']//form/div") ));
        System.out.println("---Battery List Shown---");

    }

    @Test
    public void ViewedItemsTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]/span[@class='uk-visible@s']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='login']")).sendKeys("0949975779");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys("666999333igor");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[4]//div[@class='o-background']/div/span/a[@href='/istoriya_poiska.html']")).click();
        Thread.sleep(2000);
        System.out.println("---Items viewed earlier shown---");

    }

    @Test
    public void SearchCelicaTest() throws InterruptedException {
        driver.findElement(By.xpath("/html//input[@id='button_podbor']")).click();
        driver.findElement(By.xpath("/html//input[@id='id_search_live']")).sendKeys("Celica");
        driver.findElement(By.xpath("/html//input[@id='id_search_live']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[4]/div[4]//h1[@class='o-section-title o-title-indent']")));
        System.out.println("---Toyota Celica items shown---");

    }

    @Test
    public void SearchByVinTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[3]/span[@class='uk-visible@s']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='login']")).sendKeys("0949975779");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys("666999333igor");
        driver.findElement(By.xpath("//form[@id='login-form']//input[@name='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html//input[@id='button_podbor']")).click();
        driver.findElement(By.xpath("/html//input[@id='search_vin']")).clear();
        driver.findElement(By.xpath("/html//input[@id='search_vin']")).sendKeys("WF05XXGBB51G82315");
        driver.findElement(By.xpath("/html//button[@id='button_search_vin']")).click();
        Thread.sleep(4000);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@id='tabcontrol']//span[@class='tabcaption']")));
        System.out.println("---List by Vin shown---");

    }

    @Test
    public void SidePanelOptionTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']/div/div/a[@href='#o-offcanvas-menu']/i[@class='fa fa-bars']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='o-offcanvas-menu']/div/ul//a[@href='/info_o_kompanii.html']")).click();
        Thread.sleep(2000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[@class='uk-container']/div/div[1]//img[@alt='about1']")));
        System.out.println("---Info about Autoclad shown---");

    }



    @Test
    public void LanguageChangeTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/div[2]//ul[@class='o-language-nav']/li[2]/a[@title='Украинский']")).click();
        Thread.sleep(2000);

        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[@class='uk-container']//div[@class='o-controls uk-flex-none']/a[2]")));
        System.out.println("---Language change to Ukrainian---");

    }


    @After
    public void quit(){
        driver.quit();

    }

}
