package oops.certification;

public class Parent {
    String name;

     Parent(String nm){
        this.name = nm;
        System.out.println("Super class constructor with name");
    }
    
        public Parent() {
            //TODO Auto-generated constructor stub
        }
    
    }
    
     class Sub extends Parent{
    
         Sub(){
             this("unknown");
            
         }
         Sub(String nm){
            super(nm);
            System.out.println("Sub class constructor with name");
            
        }
    
        public static void main(String[] args) {
            Sub defaultCon = new Sub();
            Sub sb = new Sub("Rahul Das");
            
            System.out.println("Default: "+defaultCon.name);
            System.out.println("Parameterised: "+sb.name);
    
            Parent obj = new Parent();
            Sub sub = new Sub();
            obj = (Parent) sub;

            //sub = (Sub) obj;
        

    }

    
}
