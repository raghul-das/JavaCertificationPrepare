package enthuware_god_level;

public class LoopMath {
    public static void main(String[] args) {
        int x = 25, y = 5;
        try {
            for (int i = 3; i >= 0; i--) {
                int result = x / i;
                System.out.println("Result: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught AE");
            y = y + 5;
        }
        System.out.println("Final y: " + y);
    }
}{
}
