package enthuware;

import java.util.ArrayList;
import java.util.List;

public class VarExamples {

   // var x = 10;
    //List list = new ArrayList<String>();
    int i;

    public static void main(String[] args) {
        var y = 10;
        var list = new ArrayList<>(); //It takes default Type when we add data
        list.add(0);
        list.add("Rahul");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
       // List list = new ArrayList<String>();

        //var s = null --Not Allowed;
        var s = (String) null; //Allowed

        for(var i = 0; i<2; i++){ //allowed

        }

        int[] arr = {1, 2, 3};
        //var arr1 = {1, 2, 3}; //Invalid
        var arr1 = new int[]{1, 2, 3}; //Valid
    }
}
