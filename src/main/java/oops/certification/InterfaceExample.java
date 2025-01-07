package oops.certification;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface InterfaceExample {

    public default void defaultMethod() {
        System.out.println("Default Method");
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void abstractMethod();

    void m1() throws IOException;

    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample() {
            @Override
            public void abstractMethod() {
                System.out.println("Abstract Method");
            }

            @Override
            public void m1() throws IOException {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'm1'");
            }
        };


        interfaceExample.abstractMethod();
        interfaceExample.defaultMethod();
        InterfaceExample.staticMethod();
    }
    
}

 interface InterfaceExample1{

    void m1() throws FileNotFoundException;
}

class test implements InterfaceExample, InterfaceExample1{

    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method");
    }

    @Override
    public void m1() throws FileNotFoundException {
        System.out.println("m1");
    }

    public static void main(String[] args) {
        test t = new test();
        
    }
}
