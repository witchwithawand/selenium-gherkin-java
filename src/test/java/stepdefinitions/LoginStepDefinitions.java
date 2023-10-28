package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("I have the access to the application link")
    public void i_have_the_access_to_the_application_link() {
        System.out.println("Inside Given");
    }

    @When("I enter the credentials")
    public void iEnterTheCredentials() {
        System.out.println("Inside When");
    }

    @Then("I should be able to login")
    public void iShouldBeAbleToLogin() {
        System.out.println("Inside Then");
    }
}
