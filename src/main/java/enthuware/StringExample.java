package enthuware;

public class StringExample {

        public void testRefs(String str, StringBuilder sb){
            str = str + sb.toString();
            sb.append(str);
            str = null;
            sb = null;
        }
        public static void main(String[] args){
            String s = "aaa";
            StringBuilder sb = new StringBuilder("bbb");
            new StringExample().testRefs(s, sb);
            System.out.println("s="+s+" sb="+sb);

                String s1 = "hello";
                StringBuilder sb1 = new StringBuilder("hello");

                s1.replace("h", "H");
                sb1.replace(0, 1, "H");

                System.out.println("s=" + s1 + " sb=" + sb1);


            int a = 1;
            int[] ia = new int[10];
            int b = ia[a];
            int c = b + a;
            System.out.println(b = c);

            StringBuilder sb28 = new StringBuilder("12345678");
            System.out.println(sb28); //12345678
            sb28.setLength(5);
            System.out.println(sb28); //12345
            sb28.setLength(10);
            System.out.println(sb28.length()); //10
            System.out.println(sb28); //12345     
        }
}

