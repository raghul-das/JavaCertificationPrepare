package certification;

public class StaticExample {
    public static class eg{
        void method(){

        }

        static void method12(){
            Parent.staticMethod();
            //method();
        }
    }

    public static void main(String[] args) {
            Parent obj = new Child();
            //staticMethod(); // Output: Parent static method (method hiding)
            Parent.staticMethod();
            //Parent.staticMethod();
        }

}

class Parent {
    static void staticMethod() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child static method");
    }
}
