package certification;

public class StringExample {
    public static void main(String[] args) {


        //*************************************//
        String s1 = "Cert";
        String s2 = "Cert";
        String s3 = new String("Cert");

        s3 = s3.intern(); //Takes copy from Heap and stores in String Pool

        System.out.println(s1 == s2); //True
        System.out.println(s1 == s3); //True


        //*************************************//

        String str1 = new String("Rahul");
        str1 = str1.intern();
        String str2 = new String("Rahul");
        str2 = str2.intern();
        System.out.println( str1 == str2); //True

        //*************************************//

        String str11 = new String("Rahul");
        String str21 = str11.intern();
        System.out.println( str11 == str21); //False

        //*************************************//

        StringBuilder sb = new StringBuilder("12345");
        sb.reverse();
        System.out.println(sb); //54321

        //*************************************//

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.insert(3, "Java"); // Insert at index 3 -- HelJavalo
        System.out.println(sb1);

        String str = "Code";
        str.concat("Craft");

        StringBuilder sb3 = new StringBuilder("Code");
        sb3.append("Craft");

        System.out.println(str); //Code
        System.out.println(sb3); //CodeCraft
        //System.out.println(test);

        String sR = "Hello";
        String test = sR.replace('l', 'p');
        System.out.println(test); //Heppo //Replaces all the characters

        StringBuilder sbCap = new StringBuilder("Java");
        System.out.println(sbCap.capacity()); //Initial Capacity is 20
        sbCap.append("ProgrammingIsFun");
        System.out.println(sbCap.capacity()); //20

        StringBuilder sbDel = new StringBuilder("ABCDEFG");
        sbDel.delete(2, 5); //AB___FG //removed 2,3,4 index
        sbDel.insert(2, "123");
        System.out.println(sbDel); //AB123FG

        String s11 = "Java";
        String s22 = "Cert";
        String s33 = s11 + s22; //JavaCert

        System.out.println(s33 == "JavaCert"); //False Different Objects

        String strTest = "Hello";
        StringBuilder sb11 = new StringBuilder(strTest);
        //strTest.concat(" World") It will create a new object but doesn't assign to previous
        strTest = strTest.concat(" World"); // since we are assigning to previous it creates a new object and overrides it.
        sb11.append(" World");

        System.out.println(strTest); //Hello World
        System.out.println(sb11); //Hello World

    }
}
