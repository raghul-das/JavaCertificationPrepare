package com.inheritance;

public interface Parent1 {

    default void display(){
        System.out.println("Display from Parent 1");
    }
/*
    static void rahul(){
        System.out.println("Static method in Interface2");
    }*/
}
