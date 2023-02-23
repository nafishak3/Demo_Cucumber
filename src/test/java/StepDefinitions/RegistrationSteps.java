package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegistrationSteps {

    @Given("User is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("User nevigates to registration page");
    }

    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {

        List <List<String>> userList = dataTable.asLists(String.class); // list of object
        for(List<String> e: userList){
            System.out.println(e);
        }
    }

    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("user registration should be successful");
    }

    @When("User enters following user details with columns")
    public void user_enters_following_user_details_with_columns(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        System.out.println(userMap);
//        System.out.println(userMap.get(0).get("Firstname"));
        for(Map<String, String> e : userMap){
            System.out.println(e.get("Firstname"));
            System.out.println(e.get("lastname"));
            System.out.println(e.get("Email"));
            System.out.println(e.get("phone"));
            System.out.println(e.get("city"));
        }
    }
}
