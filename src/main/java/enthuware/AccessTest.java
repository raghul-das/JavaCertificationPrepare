package enthuware;

public class AccessTest {
    
    String a = "x";
    static char b = 'x';
    String c = "x";

    class inner{
        String a = "y";
        String get(){
            String c = "temp";
            
            //c = a; -> y
            //c = this.a; -> y
            // c = AccessTest.this.a; //-> x
            
            //c = c; -> temp
            //c = ""+AccessTest.b; //-> x
          
            c = ""+b; // ->x
            
            return c;
        }
    }

AccessTest(){
    System.out.println(new inner().get());
}
public static void main(String[] args) {
    new AccessTest();
}

}

