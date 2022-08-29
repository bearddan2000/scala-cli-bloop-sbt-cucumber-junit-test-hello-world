import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.IsEqual.equalTo;

public class Greeting {

  String name, res;

  @Given("^Name$")
  public void createName() {
     name = "Steve";
  }

  @When("^Pass name to function$")
  public void passName() {
     res = example.Greeting.greeting(name);
  }

  @Then("^Response should be hello world Steve$")
  public void checkMessage() {
     Assertions.assertEquals(res, "Hello World, Steve");
  }
}
