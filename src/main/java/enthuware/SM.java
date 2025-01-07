package enthuware;



    public class SM {
        public String checkIt(String s) {
            if (s.length() == 0 || s == null) {
                return "EMPTY";
            } else return "NOT EMPTY";
        }

        public static void main(String[] args) {
//            SM a = new SM();
//            System.out.println(a.checkIt(null));

            String s1 = new String("Immutable"); //Heap
            String s2 = s1.intern(); //takes value from Heap Memory and puts s2 to string pool
                                     //String s2 = s1; // takes value from Heap Memory
            String s3 = "Test"; //String Pool
            String s4 = s3.intern();
            System.out.println(s1 == s2); //false
            System.out.println(s3 == s4); //true
        }
    }



