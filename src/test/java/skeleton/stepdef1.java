package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class stepdef1 {
WebDriver driver;
boolean cartAvailable;
@Given("Alex has registered to TestMe")
public void alex_has_registered_to_TestMe() {
 System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\driver\\\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm#");
 driver.findElement(By.linkText("SignIn")).click();
 driver.findElement(By.name("userName")).sendKeys("lalitha");
 driver.findElement(By.name("password")).sendKeys("password123");
 driver.findElement(By.name("Login")).click();
}

@Given("Alex searches for particular product like headphones")
public void alex_searches_for_particular_product_like_headphones() {
 driver.findElement(By.name("products")).sendKeys("Headphones");
 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@Given("Try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
 //String cart = "Cart";
        try {
            driver.findElement(By.linkText("Cart 1")).click();
            cartAvailable = true;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
}

@Given("TestMe doesn't display the cart icon")
public void testme_doesn_t_display_the_cart_icon() {
 Assert.assertTrue(!cartAvailable);
 driver.close();
}
}