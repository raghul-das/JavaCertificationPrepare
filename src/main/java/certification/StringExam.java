package certification;

public class StringExam {

     static String rahul = new StringExam().toString();
    public static void main(String[] args) {
        System.out.println(StringExam.rahul);
        
        System.out.println("String".replace('g', 'G') 
                        == "String".replace('g', 'G')); //false (both are new obj)

        System.out.println("String".replace('g', 'G') == "StrinG"); //false

        System.out.println("String".replace('g', 'g') == "String");//true 
                                            //even though replace is called, it is same letter so same obj

        System.out.println("String".replace('g', 'G') == 
                new String("String").replace('g', 'G')); //false

        System.out.println("String" == "String"); //true

        System.out.println("String" == "StrinG".replace('G', 'g')); //false
        System.out.println("String" == "StrinG".replace('G', 'g').intern()); //true 
                                            // New object from heap is transferreds to string pool


        String str = null;
        if((str == null) || 
                (str.length() > 0)){
            System.out.println("Hello Das");
        }
       
        
    }
}
