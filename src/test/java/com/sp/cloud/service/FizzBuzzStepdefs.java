package com.sp.cloud.service;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;


public class FizzBuzzStepdefs {

    FizzBuzz fizz;
    String result;

    @Given("^create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizz= new FizzBuzz();


    }

    @When("^I Play with no (\\d+)$")
    public void iPlayWithNo(int ab) {

        result = fizz.play(ab);


    }

    @Then("^the result was Buzz$")
    public void theResultWasBuzz() {

        assertEquals(result,"Buzz");

    }

    @Then("^the result was Fizz$")
    public void theResultWasFizz() {

        assertEquals(result,"Fizz");

    }
}
