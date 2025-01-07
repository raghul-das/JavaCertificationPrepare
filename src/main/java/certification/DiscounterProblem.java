package certification;

import java.io.PrintStream;

public class DiscounterProblem {

    static final double percent = 0;
    int offset = 10, base = 50;
    public static double calc(double value){

        int coupon, offset, base;
        if(percent < 10){
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon*offset*base*value/100;
    }
    
    public static void main(String[] args) {
        System.out.println(calc(100));

        var a = 100; var b = 200;
        var c = b = 500;
        var d = c > a;
        System.out.println(c +" " +a + " " +b);
        Object obj = new Object();
        System.out.println("null");

        int x , y, z = 20;
        int r = x = y = z;
        int m;
        int t = z = x = m = y = 100;
    }

}
