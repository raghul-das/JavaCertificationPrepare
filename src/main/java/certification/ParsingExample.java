package certification;

public class ParsingExample{

    public static void main(String[] args) {

        String str = "10";
        System.out.println(Integer.parseInt(str)); //10
        System.out.println(Integer.parseInt(str, 2)); //2  --> (2^0 * 0) + (2^1 * 1) = 2

        System.out.println("A"+ 1); //A1
        System.out.println(1 + 'a'); //98
        System.out.println(1 + 'a' + 1 + 1); //100
        System.out.println(1 + 5 +"A" + 2 + 1); //6A21

    }
}
