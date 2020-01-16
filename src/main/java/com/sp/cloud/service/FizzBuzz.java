package com.sp.cloud.service;

public class FizzBuzz {

    public String play(int n){
        if (n == 0) throw new IllegalArgumentException("Number not valid");
        else if(n == 3) return "Fizz";
        else if (n == 5) return "Buzz";
        return String.valueOf(n);
    }
}
