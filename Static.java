public class Static {
    static int a = 3;
    static int b;
    int c = 30;

    static void methodsStatic(int x) {

        System.out.println("x=" + x);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    static {
        System.out.println("Static Block initialized");
        b = a * 10;
    }
}

class StaticBlock {
    public static void main(String args[]) {
        System.out.println("a=" + Static.a);
        Static.a = Static.a + 50;
        System.out.println("a=" + Static.a);
        Static.methodsStatic(80);

    }
}
