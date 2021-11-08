package com.kodilla.calculator;

public class BetterCalculator {

    public int add(int a, int b, int c, int d){
        if(a > c) {
            return a + b;
        } else if (c > a) {
            return c + d;
        }
        else {
            return c+b;
        }
        }



    public int subtract(int a, int b, int c){
    int d = 0;
       for(int i = 0; i < c; i++) {
           d = d - b;


       }
        return a + d;
    }

}
