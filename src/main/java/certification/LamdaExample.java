package certification;

import java.util.Set;

public class LamdaExample extends Object implements Comparable<LamdaExample>{

    int marks;

    @Override
    public int compareTo(LamdaExample o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}

 class InnerLamdaExample{
    public static void main(String[] args) {
        
        var s = new LamdaExample(){
            @Override
            public String toString(){
                return "Hello";
            }};
        
        var sList = Set.of(new LamdaExample());

        for(var i : sList){
            System.out.println("Test: " +i);
        }

        //var s1 = sList.removeIf( (str) -> str.marks < 0);

        Integer.parseInt("10", 2);
        Integer.parseInt("14", 2);


    }

    
}
