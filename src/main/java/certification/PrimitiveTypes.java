package certification;

public class PrimitiveTypes {
    char initCH;
    public static void main(String[] args) {

        byte by = (byte) 500;   //It applies only when we exceed the range
                                // Result = X % 256 ==> If answer within range -128 to 127 then thats the answer
                                // If the answer outside range then substract with -256
        System.out.println(by);

        //byte by = 500 Compile time error with outside the range.

        byte by1 = 10 + 20; //constant addition so it is byte only
        //byte by2 = by1 + 30;  error because operator + to short. considers int for 30
        System.out.println(by1);

        short sh = 5;
        sh = (short) (sh + 127); //127 is int 32 bits remember that //lower to Higher Problem
        System.out.println("sh: " +sh);

        int i1 = 10;
        i1 = i1 + sh;  //Acceptable when Higher can adjust lower.


        long l1 = 1000; // No errors
        long l = 1000L;
        int i = (int) l;
        short s = (short) i;
        System.out.println(i);
        System.out.println(s);

        float s1 =  888832768 + 3245432233234542342L;
        System.out.println("Float S1: "+s1); //No errors and it goes out with some precision but no C Error


        //float f = 1.1; //considers double so issue
        float ff = 1000; // int storing in float
        float f1 = 2.3F;
        System.out.println("Float Values: "+f1);

        float f2 = (float) 2.2; //double to float casting
        System.out.println(f2);

        //float f3 = 32454322342;
        float f3 = 32454322342L;
        System.out.println("f3: "+f3);

        double d = 2.5;
        System.out.println("Double: "+d);


        short sh1 = 'a';
        System.out.println("char short: "+sh1);

        char alpha = (char) 85655;
        char alpha1 = (short) 65;
        System.out.println(alpha +" "+ alpha1);

        // char ch2 = -1; // Compile-time error
        //char m = 'null';
        int _Test_ = 1000;

        int aj;
        long lo;
        //System.out.println(lo);
        System.out.println(new PrimitiveTypes().initCH); //works when object is created
        //System.out.println(aj); Error


        //var ters = wrw = wdf = 100;
        //var a = 10;
        int v = 100, eww, re = 34, te;
        //int ss = 100 = we = fe;
        int tww, rww, qw = 100;


    }
}
