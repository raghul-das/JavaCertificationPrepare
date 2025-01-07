package clearconcepts.overridingConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//A class can't override a method with a different return type than the method it is overriding.
//It can have List to ArrayList return type, but not vice versa.
//It can't have different argument Type like Integer to Number, but it can have Number to Integer.

public class ListExample {

    public List<Number> getList(){

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

    public <T extends CharSequence> Collection<String> transform (Collection<T> collection){
        return new ArrayList<String>();
    }
}

class Test extends ListExample{

    public ArrayList<Number> getList(){

        ArrayList<Number> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }


    /* ******** OVERRIDING *********** */
    //Same Parameter (Overriding) and return type

    /*  Works since return type is Collections<String> --> List<String> */
     public <T extends CharSequence> List<String> transform (Collection<T> collection){ 
        return new ArrayList<String>();
    } 

    // Compilation Error -->
    //It's Overriding, so return type should be same or subType of return type of the method in the parent class.
   
    // public <T extends CharSequence> List<T> transform (Collection<T> collection){
    //    return new ArrayList<T>();
    // }

    /* **** Same issue Return Type Collection<T> is not same or subType of Collection<String> */
    
    // public <T extends CharSequence> Collection<T> transform (Collection<T> collection){
    //     return new ArrayList<T>();
    // }
    


    /**** Different Parameter (Overloading) *************** */
    //Different return type (Overloading) is also allowed

    public <T extends CharSequence> Collection<T> transform (List<T> collection){
        return new ArrayList<T>();
    }

    //compiler error due to ambiguity in the method signature even though it is overloading. 
    //Generics are not considered for method overloading.

    // public Collection<String> transform(Collection<String> collection){
    //     return new ArrayList<String>();
    // } //I still don't understand why this

   

    public static void main(String[] args) {
        new Test().getList().forEach(System.out::println);
        ListExample listExample = new Test();   
        listExample.getList().forEach(System.out::println);

        new Test().transform(null).forEach(System.out::println);

    }
}