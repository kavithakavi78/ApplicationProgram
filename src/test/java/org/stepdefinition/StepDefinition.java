package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.objectRepository.CartPage;
import org.objectRepository.RegistrationPage;
import org.objectRepository.Search;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	RegistrationPage r;
	Search s;
	CartPage c;

	// First Test case
	@Given("^User launch the Jpet Application$")
	public void user_launch_the_Jpet_Application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();
		getTitle();
	}

	@When("^User register his details$")
	public void user_register_his_details() throws Throwable {
		r = new RegistrationPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		moveTo(r.getSign());
		r.getSign().click();
		moveTo(r.getRegis());
		r.getRegis().click();
		Thread.sleep(3000);
		TakeScreenShot();
		type(r.getUserid(), getData(1, 1));
		type(r.getPass(), getData(2, 1));
		type(r.getRepass(), getData(3, 1));
		type(r.getFname(), getData(4, 1));
		type(r.getLname(), getData(5, 1));
		type(r.getEmail(), getData(6, 1));
		type(r.getPhone(), getData(7, 1));
		type(r.getAddress1(), getData(8, 1));
		type(r.getAddress2(), getData(9, 1));
		type(r.getCity(), getData(10, 1));
		type(r.getState(), getData(11, 1));
		type(r.getZip(), getData(12, 1));
		type(r.getCountry(), getData(13, 1));
		click(r.getSubmit());

	}

	@Then("^User check sign in process$")
	public void user_check_sign_in_process() throws Throwable {
		click(r.getSignIn());
		robotttt();
		type(r.getPass(), getData(2, 1));
		click(r.getSubmit());
		Thread.sleep(3000);
		TakeScreenShot();
		quit();

	}

	// Second Test Case
	@Given("^User launches Jpet Application$")
	public void user_launches_Jpet_Application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();

	}

	@When("^User login with his credentials$")
	public void user_login_with_his_credentials() throws Throwable {
		r = new RegistrationPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		moveTo(r.getSign());
		r.getSign().click();
		type(r.getUserid(), getData(1, 1));
		robotttt();
		type(r.getPass(), getData(2, 1));
		click(r.getSubmit());
	}

	@Then("^User searches the item in search tag$")
	public void user_searches_the_item_in_search_tag() throws Throwable {

		writeData("Gold Fish", 1, 0);
		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), readData(1, 0));
		click(s.getSearch());
		Thread.sleep(3000);
		TakeScreenShot();
		quit();

	}

	// Third Test Case
	@Given("^User launches the pet Application$")
	public void user_launches_the_pet_Application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();

	}

	@Given("^User login the application with credentials$")
	public void user_login_the_application_with_credentials() throws Throwable {
		r = new RegistrationPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		moveTo(r.getSign());
		r.getSign().click();
		type(r.getUserid(), getData(1, 1));
		robotttt();
		type(r.getPass(), getData(2, 1));
		click(r.getSubmit());

	}

	@When("^User Searching the pet in search box$")
	public void user_Searching_the_pet_in_search_box() throws Throwable {

		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), getData(16, 0));
		click(s.getSearch());
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@When("^User add the pet in cart$")
	public void user_add_the_pet_in_cart() throws Throwable {
		c = new CartPage();
		moveTo(c.getSelectPet());
		click(c.getSelectPet());
		Thread.sleep(3000);
		TakeScreenShot();

		click(c.getAddtoCart());
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@Then("^User placed the order$")
	public void user_placed_the_order() throws Throwable {
		c = new CartPage();
		TakeScreenShot();
		click(c.getCheckout());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getSubmit());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getConfirm());
		Thread.sleep(3000);
		TakeScreenShot();
		quit();

	}

	// Fourth Test Case
	@Given("^User launching the pet application$")
	public void user_launching_the_pet_application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();

	}

	@Given("^User logged in with valid credentials$")
	public void user_logged_in_with_valid_credentials() throws Throwable {
		r = new RegistrationPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		moveTo(r.getSign());
		r.getSign().click();
		type(r.getUserid(), getData(1, 1));
		robotttt();
		type(r.getPass(), getData(2, 1));
		click(r.getSubmit());

	}

	@When("^User select the pets$")
	public void user_select_the_pets() throws Throwable {

		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), getData(16, 0));
		click(s.getSearch());
		Thread.sleep(3000);
		TakeScreenShot();
		c = new CartPage();
		moveTo(c.getSelectPet());
		click(c.getSelectPet());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getAddtoCart());
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@When("^User update the cart$")
	public void user_update_the_cart() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		c = new CartPage();
		moveTo(c.getUpdateCart());

		c.getUpdateCart().click();
		Thread.sleep(3000);
		moveTo(c.getMainMenu());
		click(c.getMainMenu());
		TakeScreenShot();

	}

	@Then("^User add one more item in cart$")
	public void user_add_one_more_item_in_cart() throws Throwable {

		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), getData(17, 0));
		click(s.getSearch());
		Thread.sleep(3000);
		TakeScreenShot();
		c = new CartPage();
		moveTo(c.getChoosePet());
		click(c.getChoosePet());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getAddtoCart());
		Thread.sleep(3000);
		TakeScreenShot();
		System.out.println("Cart is updated");

	}

	// Last Test Case
	@Given("^User launching the Jept application$")
	public void user_launching_the_Jept_application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();

	}

	@Given("^User login with valid credentials$")
	public void user_login_with_valid_credentials() throws Throwable {
		r = new RegistrationPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		moveTo(r.getSign());
		r.getSign().click();
		type(r.getUserid(), getData(1, 1));
		robotttt();
		type(r.getPass(), getData(2, 1));
		click(r.getSubmit());

	}

	@When("^User search the item and add to the cart$")
	public void user_search_the_item_and_add_to_the_cart() throws Throwable {
		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), getData(16, 0));
		click(s.getSearch());
		Thread.sleep(3000);
		TakeScreenShot();
		c = new CartPage();
		moveTo(c.getSelectPet());
		click(c.getSelectPet());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getAddtoCart());
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@Then("^User click remove option in cart page$")
	public void user_click_remove_option_in_cart_page() throws Throwable {
		moveTo(c.getRemoveCart());
		click(c.getRemoveCart());
		Thread.sleep(3000);
		TakeScreenShot();
		quit();

	}

}
