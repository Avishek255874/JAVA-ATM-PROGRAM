public class StaticCallme {
    static int a = 40;
    static int b = 500;

    static void Callme() {
        System.out.println("a=" + a);
    }
}

class StaticBox {
    public static void main(String args[]) {
        StaticCallme.Callme();
        System.out.println("b=" + StaticCallme.b);
    }
}