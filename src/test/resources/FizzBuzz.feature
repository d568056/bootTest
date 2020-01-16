Feature: Fizz Buzz Game play
  Scenario: Play FizzBuzz to get Fizz
    Given create a FizzBuzz game play
    When I Play with no 5
    Then the result was Buzz

  Scenario: Play FizzBuzz to get Fizz
    Given create a FizzBuzz game play
    When I Play with no 3
    Then the result was Fizz
