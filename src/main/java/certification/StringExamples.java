package certification;

public class StringExamples {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s5 = "He" + "ll" + "o";
        System.out.println( s1 == s5);

        final int i1 = 1;
        final Integer i2 = 1;
        final String st1 = ":ONE";

        String str1 = i1 + st1;
        //System.out.println(str1);
        String str2 = i2 + st1;
        //System.out.println(str2);

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");

        String numbers = "012345678";
        System.out.println(numbers.substring(1, 5));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(6));

        double d = 10.5;
        int i = (int) d;
        System.out.println(i);

        Object obj = "Java";
        /*Integer i5 = (Integer) obj; //class cast
        System.out.println(i5);*/

        Object obj1 = "42";
        String in = (String) obj1;
        System.out.println(in);

        Object[] arr = new String[3];
        arr[0] = "Raghul";
        //arr[1] = 42;
        System.out.println(arr[1]);

        Object obj2 = "42";
        //Integer i3 = (Integer) obj2;
       // System.out.println(i3); // class cast exception


        /*String s11 = "Java";
        String s2 = s11.concat("Programming");
        System.out.println(s11);
        System.out.println(s2);*/

        String s2 = "Java";
        String s3 = "Java";
        String s4 = new String("Java");

        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));

        String str = "HelloWorld";
        String sub1 = str.substring(0, 5);
        String sub2 = str.substring(5);

        System.out.println(sub1);
        System.out.println(sub2);

        String str3 = "  Java  ";
        String result = str3.trim().toUpperCase().substring(0, 4);
        System.out.println(result);



                String s = "MINIMUM";
                System.out.println("Substring 4 7: "+s.substring(4, 7));//1
                System.out.println("Substring 5: "+s.substring(5)); //2
                System.out.println("Index of I: 3: "+s.substring(s.indexOf('I', 3))); //3
                System.out.println("Index of I: 4: "+s.substring(s.indexOf('I', 4))); //4


    }
}
