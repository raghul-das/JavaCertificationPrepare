package enthuware;

public class LoopMath {
    public static void main(String[] args) {

       /* int x = 25, y = 5;
        try {
            for (int i = 3; i >= 0; i--) {
                int result = x / i;
                System.out.println("Result: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught AE");
            y = y + 5;
        }
        System.out.println("Final y: " + y);*/

    /*    int x = 5, y = 0;
        try {
            try {
                int z = x / y; // Division by zero
            } catch (ArithmeticException e1) {
                System.out.println("Caught Inner AE");
                throw e1;
            }
        } catch (Exception e2) {
            System.out.println("Caught Outer Exception");
        }
        System.out.println("Done");*/

/*
        int a = 10, b = 2, c = 0;
        try {
            c = a / b;
            b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception");
            c = 5;
        }
        a = a / c;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);*/


       /* int x = 10, y = 0;
        try {
            System.out.println("Result: " + (x / y));
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("End of program");*/

        /*try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught General Exception");
        }*/


      int i, j, k;
      i = j = 8; k = 8;
      System.out.println(i);

        float x, y, z;
        x = y = z = 5.5f; // Assigning float values
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);

        boolean a, b, c;
        a = b = c = true;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        int i1;
        double d;
        i1 = (int)(d = 10.5); // Chaining with type casting
        System.out.println("i1: " + i1 + ", d: " + d);

        int i2, j2, k2 = 10;
        i2 = j2 = k2; // Only k is initialized
        System.out.println("i2: " + i2 + ", j2: " + j2 + ", k2: " + k2);
    }
    }
