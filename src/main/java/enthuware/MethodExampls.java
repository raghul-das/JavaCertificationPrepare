package enthuware;

public class MethodExampls {
     //abstract void method1(int x, int y);

     //public void method2(int x, int... y);
     public static void main(String[] args) {

     String s = "MINIMUM";
     System.out.println(s.indexOf('I', 3)); //3
     System.out.println(s.indexOf('I', 4)); //-1
     System.out.println("Index of I: 3: "+s.substring(s.indexOf('I', 3))); //IMUM
     System.out.println("Substring 4 , 7:"+s.substring(4, 7)); //MUM 
     //System.out.println("Substring 4 , 8:"+s.substring(4, 8)); //StringIndexOutOfBoundsException (value shouldn't exceed the length of the string) 

     boolean b = false || (10 > 2); 
     System.out.println(b);

     var x = new int[][]{{1,2,3}, {4,5,6}};

     var y = new Double[]{1d, 2d, 3d};
     System.out.println("Double: "+y[2]);
     
     var y1 = new Float[]{1f, 2F, 3f};
     System.out.println("FLOAT: "+y1[2]);

     var y2 = new float[]{1, 2, 3};
     System.out.println("float: "+y2[2]);
     }

}
