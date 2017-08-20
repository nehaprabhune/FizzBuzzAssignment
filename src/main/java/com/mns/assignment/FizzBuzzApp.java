package com.mns.assignment;

import static java.lang.System.exit;

public class FizzBuzzApp {

    public static void main(String[] args) {
        FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
        if(args.length == 0) {
            System.out.println("Please enter an Integer to test FizzBuzz App");
            exit(0);
        }
        Integer maxNum = Integer.valueOf(args[0]);
        if(maxNum.equals(0)){
            System.out.println("Please enter value greater than 0");
            exit(0);
        }
        StringBuilder strBuilder = new StringBuilder();
        for(int i =1;i <= maxNum;i++){
            strBuilder.append(fizzBuzzApp.getResultantString(i));
            if(i < maxNum){
                strBuilder.append(", ");
            }
        }
        System.out.println("Result: "+ strBuilder);
    }
    
    String getResultantString(Integer num) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        return fizzBuzz.getFizzBuzzString(num);
    }
    
}
