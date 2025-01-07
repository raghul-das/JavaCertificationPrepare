package com.exceptions;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            //int x = 5 / 0;
            String str = null;
            //str.length();
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        finally{
            System.out.println("Finally Block");
        }

        System.out.println("Test Sentence");
    }
}