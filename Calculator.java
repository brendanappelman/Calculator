package com.company;

import java.io.IOException;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        try {
            int firstNumber = readNumber();
            int operator = readOperator();
            int secondNumber = readNumber();

            System.out.println("First number: " + firstNumber);
            System.out.println("Operator: " + (char)operator);
            System.out.println("Second Number: " + secondNumber);

            double result = 0;

            switch (operator){
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = (double)firstNumber / secondNumber;
                    break;
                case '%':
                    result = (double)firstNumber % secondNumber;
                    break;
                case '^':
                    result = pow(firstNumber, secondNumber);
                default: System.out.println("Unkown operator: " + (char)operator);
                    break;
            }

            System.out.println("Result: " + result);

        } catch (IOException e) {
            System.out.println("Could not read the equation you typed in: " + e);
        }

    }

    private static int readOperator() throws IOException {
        int c = System.in.read();

        switch(c) {
            case '+':case'-':case'*':case'/':case'%':case'^':
                break; //all accepted values
            default:
                throw new RuntimeException("Unkown operator: " + (char)c);
        }
        return c;
    }

    public static int readNumber() throws IOException{
            int c = System.in.read();
            return Character.getNumericValue(c);
    }
}
