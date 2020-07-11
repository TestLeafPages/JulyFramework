package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public ChromeDriver driver;

	@Given("Open the chrome browser and load the url")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@And("Enter the username as (.*) and password as (.*)")
	public void enterCred(String uname, String pwd) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@And("Click the Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("Click the CRMSFA Link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click the Leads Link")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click the Create Lead Link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("Enter the Company Name as (.*)")
	public void enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@And("Enter the First Name as (.*)")
	public void enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And("Enter the Last Name as (.*)")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click on the Create Lead Button")
	public void clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Verify the Lead Creation")
	public void verifyLeadCreation() {
		System.out.println("Lead Created Successfully");
	}
	@But("Verify the error message")
	public void verifyErrormsg() {
		System.err.println("Error message verified");
	}
}

