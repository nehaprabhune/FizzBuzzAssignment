package com.mns.assignment;

public class FizzBuzz {
       
    boolean isDivisibleByThree(int num) {
        return num%3 == 0;
    }

    boolean isDivisibleByFive(int num) {
        return num%5 == 0;
    }
    
    boolean isDivisibleBy3and5(int num) {
        return num%15 == 0;
    }

    String getFizzBuzzString(int num) {
        if(isDivisibleBy3and5(num)){
            return "FizzBuzz";
        } else if (isDivisibleByThree(num)){
            return "Fizz";
        } else if(isDivisibleByFive(num)){
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }        
}
