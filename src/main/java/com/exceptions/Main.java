package com.exceptions;

public class Main {
    public static void main(String[] args) {

        try{
            String name = null;
            //name.substring(0,3);
            throw new CustomExceptionExample("name is null");
        } catch (CustomExceptionExample e) {
            System.out.println(e.getMessage());
        }
    }
}
