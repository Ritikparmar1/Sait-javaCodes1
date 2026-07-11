class Abc {
    void m1() {
        System.out.println("Hello ABC");
    }

    void m2() {
        System.out.println("Hi ABC");
    }
}

interface Xyz {
    void m();
    void mm();
}

public class AnonymousNested {
    public static void main(String[] args) {

        Abc a1 = new Abc() {
            void m1() {
                System.out.println("Byee ABC");
            }

            void m2() {
                System.out.println("Hi -Byee ABC");
            }
        };

        a1.m1();
        a1.m2();
    }
}