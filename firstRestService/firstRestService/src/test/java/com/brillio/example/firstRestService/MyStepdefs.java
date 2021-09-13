package com.brillio.example.firstRestService;

import com.brillio.example.firstRestService.Controllers.PostController;
import com.brillio.example.firstRestService.CucumberSpringConfiguration;
import com.brillio.example.firstRestService.StudentDTO;
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

public class MyStepdefs extends CucumberSpringConfiguration {

    @Autowired
    PostController postController;
    StudentDTO studentDTO;
    String result;

        @Given("A student enrolls")
        public void aStudentEnrolls(){
            studentDTO = new StudentDTO();
        }

        @When("The data is collected")
        public void theDataIsCollected(){
            studentDTO.setSid("s112");
            studentDTO.setFname("Hey");
            studentDTO.setLname("Alans");
            studentDTO.setDob("1999-12-12");
            studentDTO.setAddress("Ranchi");
            result = postController.insertStudent(studentDTO);

        }

        @Then("The data is added in the database")
        public void dataIsAddedInTheDatabase(){
           assertEquals(result, "Data is inserted");
        }

}
