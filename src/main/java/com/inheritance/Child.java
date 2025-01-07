package com.inheritance;

public class Child implements Parent1, Parent2 {


/*    @Override
    public void display() {
        //Parent1.super.display();
        System.out.println("Display from Child");
    }*/

    public Child() {
        System.out.println("Child Constructor");
    }

    @Override
    public void display() {
        Parent1.super.display();
    }

   /* static void rahul(){
        System.out.println("static in Child");
    }*/

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        Parent2.rahul();
        //rahul();
        //Parent1.rahul();
    }
}
