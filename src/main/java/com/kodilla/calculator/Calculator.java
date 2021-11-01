package com.kodilla.calculator;

import java.util.Random;

public class Calculator {

    int x;
    int y;
    int result;

        public Calculator(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void addXandY(){

           result = x + y;
            System.out.println(result);
        }

        public void subtractXandY(){

            result = x - y;
            System.out.println(result);
        }

        public static void main(String args[]){

            Calculator calculator = new Calculator(14,8);
                    calculator.addXandY();
                    calculator.subtractXandY();
        }

}
