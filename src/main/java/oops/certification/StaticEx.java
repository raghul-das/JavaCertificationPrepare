package oops.certification;

class TestClass {
    static TestClass ref;
    String[] arguments;

     static void main(String args[]) {
        ref = new TestClass(); // Creates an instance of TestClass and assigns it to the static variable 'ref'
        ref.func(args);        // Calls the non-static method 'func' on the instance 'ref'
;
    }

    public void func(String[] args) {
        ref.arguments = args;  // Assigns the 'args' array to the non-static 'arguments' field
    }

}
