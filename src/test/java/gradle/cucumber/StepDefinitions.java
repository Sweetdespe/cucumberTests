package gradle.cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    
	WebDriver driver;

    @Then("I open Firefox")
    public void i_open_firefox() 
    {
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
    
<<<<<<< HEAD
    @When("I search Hello Word")
    public void i_search_hello_world() 
    {
		WebElement recherche = driver.findElement(By.name("q"));
		recherche.sendKeys("hello World" + Keys.ENTER);
	}
=======
    @When("I search Hello World")
    public void i_search_hello_world()
    {
    	WebElement recherche = driver.findElement(By.name("q"));
    	recherche.sendKeys("Hello World" + Keys.ENTER);
    }
>>>>>>> f4d2f8e4166faa51cfd92b89530a6c23619417bb
    
    @When("I open Chrome")
    public void i_open_chrome() 
    {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
    
<<<<<<< HEAD
    //expression regulière
    @Then("^I close the browser$") 
=======
    @Then("I close the browser")
>>>>>>> f4d2f8e4166faa51cfd92b89530a6c23619417bb
    public void i_close_the_browser()
    {
    	driver.quit();
    }
    
    @Given("I open IE")
    public void i_open_IE() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
}
