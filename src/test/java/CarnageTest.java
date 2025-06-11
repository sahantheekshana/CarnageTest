import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CarnageTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://incarnage.com/");
    }
    @Test
    public void testAddToCart() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("NavTopLink"))).perform();

        WebElement selectTShirts = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
        selectTShirts.click();

        String tName = driver.findElement(By.xpath("//h5[normalize-space()='World Tour OS NYC Tee']")).getAttribute("innerText");
        driver.findElement(By.xpath("//h5[normalize-space()='World Tour OS NYC Tee']")).click();

        String tColor = driver.findElement(By.xpath("//span[normalize-space()=': Jet Black']"))
                .getAttribute("innerText")
                .toLowerCase()
                .replaceAll("[^a-z ]", "")
                .trim();

        driver.findElement(By.xpath("//span[normalize-space()=': Jet Black']")).click();

        String tPrice = driver.findElement(By.xpath("//div[@class='price']//span//span[@class='money'][normalize-space()='LKR 4,950']")).getAttribute("innerText");
        driver.findElement(By.xpath("//div[@class='price']//span//span[@class='money'][normalize-space()='LKR 4,950']")).click();

        String tSize = driver.findElement(By.xpath("//label[@for='Size-2-2']")).getText();
        driver.findElement(By.xpath("//label[@for='Size-2-2']")).click();

        driver.findElement(By.xpath("//div[@data-fragment='add-to-cart-button']//button[@type='submit']")).click();

        Thread.sleep(5000);

        driver.navigate().back();

        actions.moveToElement(driver.findElement(By.id("NavTopLink"))).perform();
        WebElement selectShorts = driver.findElement(By.xpath("//a[text()='Shorts']"));
        selectShorts.click();

        String sName = driver.findElement(By.xpath("//h5[normalize-space()='Velocity Elite Shorts']")).getAttribute("innerText");
        driver.findElement(By.xpath("//h5[normalize-space()='Velocity Elite Shorts']")).click();

        String sColor = driver.findElement(By.xpath("//span[normalize-space()=': Navy']")).getAttribute("innerText");
        driver.findElement(By.xpath("//span[normalize-space()=': Navy']")).click();

        String sPrice = driver.findElement(By.xpath("//div[@class='price']//span//span[@class='money'][normalize-space()='LKR 5,250']")).getAttribute("innerText");
        driver.findElement(By.xpath("//div[@class='price']//span//span[@class='money'][normalize-space()='LKR 5,250']")).click();

        String sSize = driver.findElement(By.xpath("//div[normalize-space()='s']")).getText();
        driver.findElement(By.xpath("//div[normalize-space()='s']")).click();

        driver.findElement(By.xpath("//div[@data-fragment='add-to-cart-button']//button[@type='submit']")).click();

        //cart validation............................................................................................................

        String cartTName = driver.findElement(By.xpath("//h5[normalize-space()='World Tour OS NYC Tee']")).getAttribute("innerText");

        String cartTColor = driver.findElement(By.xpath("//span[@class='text-[12px] sm:text-sm'][contains(text(),'Jet Black')]"))
                .getAttribute("innerText")
                .toLowerCase()
                .replaceAll("[^a-z ]", "")
                .trim();

        String cartTPrice = driver.findElement(By.xpath("//div[@class='!mt-1 flex gap-x-1 text-[12px] sm:text-[13px]']//div//span[@class='money'][normalize-space()='LKR 4,950']")).getAttribute("innerText");

        String cartTSize = driver.findElement(By.xpath("//span[normalize-space()='M']")).getAttribute("innerText");

        Assert.assertEquals(tName,cartTName,"Values Miss Matched");
        Assert.assertEquals(tColor,cartTColor,"Values Miss Mached");
        Assert.assertEquals(tPrice,cartTPrice,"Values Miss Matched");
        Assert.assertEquals(tSize,cartTSize,"Values Miss Matched");



















    }


}
