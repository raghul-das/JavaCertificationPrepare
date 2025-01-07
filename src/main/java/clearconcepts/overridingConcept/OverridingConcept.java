package clearconcepts.overridingConcept;

public class OverridingConcept {

     private static void privateMethodTest() {
            System.out.println("Parent's private method");
        }
        public static void main(String[] args) {
            Parent parent = new Child();
            //Child c = (Child) new Parent(); //Class cast exception (Runtime exception)
            //Parent p = (Child) new Parent(); //Runtime exception 
            
            parent.publicMethod(); // Output: Child's overridden public method
            parent.defaultMethod(); // Output: Child's default method
            parent.protectedMethod(); // Output: Child's protected method
            parent.staticMethod(); // Output: Parent's static method
            //parent.test();

            Parent superClass = new Parent();
            superClass.publicMethod(); // Output: Parent's public method
            superClass.defaultMethod(); // Output: Parent's default method
            superClass.protectedMethod(); // Output: Parent's protected method        
            superClass.staticMethod();  // Output: Parent's static method
    
            // privateMethod() is not accessible here
            // parent.privateMethod(); // Compilation error

            Child child = new Child();
            child.staticMethod(); // Output: Child's static method

            privateMethodTest(); // Output: Parent's private method

        }
    
}


class Parent {
    private void privateMethod() {
        System.out.println("Parent's private method");
    }

    public void publicMethod() {
        System.out.println("Parent's public method");
    }

    void defaultMethod() {
        System.out.println("Parent's default method");
    }
    protected void protectedMethod() {
        System.out.println("Parent's protected method");
    }
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }
    public final void finalMethod() {
        System.out.println("Parent's final method");
    }

}

class Child extends Parent {
    // This is not overriding, but a new method in the Child class.
    private void privateMethod() {
        System.out.println("Child's private method");
    }

    @Override
    public void publicMethod() {
        System.out.println("Child's overridden public method");
    }
    void defaultMethod() {
        System.out.println("Child's default method");
    }
    protected void protectedMethod() {
        System.out.println("Child's protected method");
    }
    public static void staticMethod() {
        System.out.println("Child's static method");
    }
    // public final void finalMethod() {
    //     System.out.println("Child's final method");
    // }
}