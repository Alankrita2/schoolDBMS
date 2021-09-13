package com.brillio.example.firstRestService;

import com.brillio.example.firstRestService.Controllers.PostController;
import com.brillio.example.firstRestService.CucumberSpringConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")

public class StudentLeaving extends CucumberSpringConfiguration {
   @Autowired
   PostController postController;

    String result;

    @Given("A student leaves")
    public void aStudentLeaves() {

    }


    @When("The data is deleted")
    public void theDataIsDeleted(){
     result = postController.deleteStudent("s112");
    }

    @Then("The data is removed from the database")
    public void dataIsRemovedFromTheDatabase(){
        assertEquals(result, "Data is deleted");
    }

}
