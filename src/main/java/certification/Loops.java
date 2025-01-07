package certification;

public class Loops {

    public static void main(String[] args) {


        var ostrich = new Character[]{'A', 'B', 'C'};
        var ostrich1 = new Character[]{'D', 'E', 'F'};
        L1: for (var emu : ostrich) {
            System.out.println("outer " + emu);
            L2: for (var emu1 : ostrich1) {
                System.out.println("Inner " + emu1);
                break L2;
            }
        }

        long y = 0;
        int x = 0;
        for ( ; x < 5; ) {
            System.out.println("Test" + x++);
        }

    }
}

class Outer {
    static class Inner {
        void display() {
            System.out.println("Static Nested Class");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display(); // Output: Static Nested Class
    }
}
