package certification;

public class WrapperClass {
    public static void main(String[] args) {

        int num = Integer.parseInt("2147483647");
        System.out.println(num);

        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);

        Integer i1 = Integer.valueOf("123");
        int i2 = Integer.parseInt("143");

        Float f1 = Float.valueOf(12);
        float f2 = Float.parseFloat("123");
        System.out.println(f1 +" "+ f2);

        int a1 = 7;
        int b1 = 3;
        System.out.println(a1 / b1 * b1 + a1 % b1);

        int a2 = 5, b2 = 0;
        System.out.println((b2 != 0 && a2 / b2 > 1)); // Line 1
        System.out.println((b2 != 0 & a2 / b2 > 1));
    }
}
