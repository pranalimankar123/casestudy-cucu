package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	WebDriver driver;
	@Given("user should navigate to testmeapp on chrome browser")
	public void user_should_navigate_to_testmeapp_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	}

	@When("user should click on register link")
	public void user_should_click_on_register_link() {
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enter with username as {string}")
	public void user_enter_with_username_as(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);        
	}

	@When("user enter with first name as {string}")
	public void user_enter_with_first_name_as(String fn) {
		driver.findElement(By.name("firstName")).sendKeys(fn);
	}

	@When("user enter with last name as {string}")
	public void user_enter_with_last_name_as(String ln) {
		driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	@When("userenter with password as {string}")
	public void userenter_with_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("user enter with confirm password as {string}")
	public void user_enter_with_confirm_password_as(String confirm) {
		 driver.findElement(By.name("confirmPassword")).sendKeys(confirm);
	}

	@When("user selects the gender")
	public void user_selects_the_gender() {
		  driver.findElement(By.name("gender")).click();
	}

	@When("user enter with email as {string}")
	public void user_enter_with_email_as(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enter with mobile number as {string}")
	public void user_enter_with_mobile_number_as(String mob) {
		 driver.findElement(By.name("mobileNumber")).sendKeys(mob);
	}

	@When("user enter with dob as {string}")
	public void user_enter_with_dob_as(String dob) {
		 driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("user enter with address as {string}")
	public void user_enter_with_address_as(String add) {
		driver.findElement(By.name("address")).sendKeys(add);
	}

	@When("user selects the security que")
	public void user_selects_the_security_que() {
	   
	}

	@When("user enter the security ans as {string}")
	public void user_enter_the_security_ans_as(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("user should verify registration success")
	public void user_should_verify_registration_success() {
		Assert.assertEquals(driver.getTitle(), "Login");
	}
	@When("user should click on login link")
	public void user_should_click_on_login_link() {
		driver.findElement(By.linkText("SignIn")).click();
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}
	@Then("user should verify login success")
	public void user_should_verify_login_success() {
		Assert.assertEquals(driver.getTitle(), "Home");
	}
	@When("search for headphones")
	public void search_for_headphones() throws InterruptedException {
		WebElement elmt=driver.findElement(By.xpath("//a[@href='#']"));
        Actions a=new Actions(driver);
        a.moveToElement(elmt).click().build().perform();
        Thread.sleep(4000);
        WebElement subelmt=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/a/span"));
        a.moveToElement(subelmt).click().build().perform();
        Thread.sleep(4000);
        WebElement subelmt1=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a/span"));
        a.moveToElement(subelmt1).click().build().perform();
		
	    //WebElement search=driver.findElement(By.id("myInput"));
	    //Actions a=new Actions(driver);
	    //a.keyDown(search,Keys.SHIFT).sendKeys("head").keyUp(Keys.SHIFT).build().perform();
	    //Thread.sleep(2000);
	    //a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    //WebElement addtocart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a/span"));
        //a.moveToElement(addtocart).click().build().perform();
        //driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
        
       
	}

	@When("add to cart")
	public void add_to_cart() {
		Actions a=new Actions(driver);
		WebElement addtocart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
        a.moveToElement(addtocart).click().build().perform();
        driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
        
	}

	@Then("verify the search page")
	public void verify_the_search_page() {
		Assert.assertEquals(driver.getTitle(), "View Cart");
	}





}
