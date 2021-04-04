package com.solvd.hellogit;

public class Collatz{
    public static int calculateSteps(int number){
        if(number == 1){
            return 0;
        } else if ((number % 2 == 0)){
            return 1 + calculateSteps(number / 2);
        } else {
            return 1 + calculateSteps(3 * number + 1);
        }
    }
}