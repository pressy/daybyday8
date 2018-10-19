package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class registersteps {
   WebDriver driver;
    @Given("^I navigate to giftrete com$")
    public void iNavigateToGiftreteCom() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Ahmed\\IdeaProjects\\daybyday7\\src\\test\\resources\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.giftrete.com");
    }

    @When("^I Click on Register link$")
    public void iClickOnRegisterLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector(".right > li:nth-child(3) > a:nth-child(1)")).click();
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String arg0)throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("first_name")).sendKeys("fred");
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String arg0)throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("last_name")).sendKeys("james");
    }

    @And("^I email \"([^\"]*)\"$")
    public void iEmail(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email")).sendKeys(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector(".right > li:nth-child(3) > a:nth-child(1)")).sendKeys("0000000s");
    }

    @And("^I confirm password \"([^\"]*)\"$")
    public void iConfirmPassword(String arg0)throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector(".right > li:nth-child(3) > a:nth-child(1)")).sendKeys("00000000s");
    }

    @And("^I click on sign up$")
    public void iClickOnSignUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Sign Up")).click();
    }

    @Then("^I am register$")
    public void iAmRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobilenumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("mobile")).sendKeys(mobilenumber);
    }


}
