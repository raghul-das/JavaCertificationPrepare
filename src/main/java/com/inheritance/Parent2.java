package com.inheritance;

public interface Parent2 {

    default void display(){
        System.out.println("Display from Parent 2");
    }

    static void rahul(){
        System.out.println("Static method in Interface1");
    }
}
