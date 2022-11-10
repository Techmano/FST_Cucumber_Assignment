package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class stepdifinationclass {
	
	WebDriver driver = hooksclass.driver;
	
	@Given("User navigates to test website")
	public void user_navigates_to_test_website() {
		   System.out.println("user is navigating to the facebook application");
		   
		   driver.get("http://elearningm1.upskills.in/main/auth/inscription.php");
	}

	@When("user enter {string} username , {string} password and other details")
	public void user_enter_username_password_and_other_details(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("firstname")).sendKeys("Kat");
	    driver.findElement(By.name("lastname")).sendKeys("Kumar");
	    driver.findElement(By.name("email")).sendKeys("merk12@gmail.com");
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("pass1")).sendKeys(password);
	    driver.findElement(By.name("pass2")).sendKeys(password);	
		
	}

	@When("user clicks on ok button")
	public void user_clicks_on_ok_button() throws InterruptedException {
	    
		 driver.findElement(By.name("submit")).click();

	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() throws InterruptedException {
	    System.out.println("User successfully Completed");
	    driver.findElement(By.name("next")).click();
	    Thread.sleep(6000);
	    
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {

	}
	
	@Then("Click on HomePage")
	public void click_on_HomePage() throws InterruptedException {
	    
		driver.findElement(By.xpath("//div[@id='menuone']/ul/li[1]")).click();
		Thread.sleep(4000);
		
	}

	@Then("Send Email to person")
	public void send_Email_to_person() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='profileCollapse']/div/ul/li[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']/li/input")).sendKeys("Mon");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[2]")).click();
		driver.findElement(By.name("title")).sendKeys("Todo-Email");
		driver.findElement(By.name("compose")).click();
		Thread.sleep(4000);
		String comp = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		String match = "The message has been sent to Monish Kumar";
		
		System.out.println(comp);
		
		if(comp.equals(match))
		{
		System.out.println("Message sent");
		}
			
	}


}
