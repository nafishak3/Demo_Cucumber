package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is on application landing page")
    public void user_is_on_application_landing_page() {
        System.out.println("step 1");
    }
    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        System.out.println("step 2");
    }
    @Then("user is displayed login screen")
    public void user_is_displayed_login_screen() {
        System.out.println("step 3");
    }
    @When("user enters {string} in username field")
    public void user_enters_in_username_field(String string) {
        System.out.println("step 4");
    }
    @When("user enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        System.out.println("step 5");
    }
    @Then("user gets login failed error message")
    public void user_gets_login_failed_error_message() {
        System.out.println("step 6");
    }
}
