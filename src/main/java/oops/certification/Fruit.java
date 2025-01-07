package oops.certification;

public enum Fruit {                     //Only public is permitted || Not Final, private, protected, static, default || small case enum *Remember*
      APPLE("Red", 50), BANANA, ORANGE("Orange", 30); // All the constants calls the constructor of the enum
    
        String color; // variables can be private, protected, public, default
        private int price;
          Fruit(String colour, int i) {  //All constructors should be private || so that we can't create object of enum using new keyword
            this.color = colour;
            this.price = i;
        }
        Fruit() {
            this.color = "Yellow";
            this.price = 10;
        } 

        public static void main(String[] args) {
            Fruit ff = Fruit.APPLE;
            System.out.println(ff.name());
            System.out.println(ff.valueOf("APPLE"));
            System.out.println(ff.ordinal());
            System.out.println(ff.color);
            System.out.println(ff.price);

            java.util.Arrays.stream(Fruit.values()).forEach(System.out::print);
        }
}

class TestClass{

    public static enum Season {WINTER, SPRING, SUMMER, FALL; // enum methods can be declared inside the class
    
    public void getSeason(){
        System.out.println("Season is: "+Season.WINTER);
    };
}

   
}
