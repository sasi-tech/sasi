package stepdef;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameterization {
WebDriver driver=null;
@Given("User is open the application")
public void user_is_open_the_application() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browser and drivers\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.manage().window().maximize();
   
}

@When("User click on the SignIn link")
public void user_click_on_the_SignIn_link() {
 driver.findElement(By.linkText("SignIn")).click();
  System.out.println("HomePage Title:"+driver.getTitle());
}

@When("User enters the {string} and {string}")
public void user_enters_the_and(String username, String password) {
 driver.findElement(By.id("userName")).sendKeys(username);
 driver.findElement(By.id("password")).sendKeys(password);
 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
   
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
}
@Then("meassage displyed Login Sucessfully")
public void meassage_displyed_Login_Sucessfully() {
   
}
}