package oops.certification;

public class OverloadingConcept {

    // public void display(int x){
    //     System.out.println("In int");
    // }
    // public void display(Integer x){
    //     System.out.println("In Integer");
    // }
    // public void display(int... x){
    //     System.out.println("In int var-args");
    // }
    // public void display(Integer... x){
    //     System.out.println("In Integer var-args");
    // }
    // public void display(long... x){
    //     System.out.println("In long var-args");
    // }
    // public void display(float x){
    //     System.out.println("In float");
    // }
    // public void display(double x){
    //     System.out.println("In double");
    // }
    public void display(Double x){
        System.out.println("In double");
    }
    public void display(Object... x){
        System.out.println("In Object var-args");
    }
    public void display(Number... x){
        System.out.println("In Number var-args");
    }
    // public void display(long x){
    //     System.out.println("In long");
    // }
    public void display(Long x){
        System.out.println("In Long");
    }
    // public void display(Object x){
    //     System.out.println("In Object");
    // }
    // public void display(Number x){
    //     System.out.println("In Number");
    // }


    public static void main(String[] args) {
        OverloadingConcept obj = new OverloadingConcept();

        int x = 10; long y = 10; float z = 10.0f; double w = 10.0;
        obj.display(x);  // int --> long --> Integer --> Number --> Object --> long var-args --> Integer var-args -->
        // obj.display(y);
        // obj.display(z);
        // obj.display(w);
    }


   // int --> long --> float --> double --> Integer --> Number --> Object --> int... (or) long... (or) Integer... 
            //                                                            --> Number... --> Object...
}
