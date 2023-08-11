  
class Poly {
    void test() {
        System.out.println("Overload with no parameter");

    }

    void test(int a) {
        System.out.println("Overload with one  parameter");
        System.out.println("Value:" + a);
    }

    void test(int a, int b) {
        System.out.println("Overload with  two  parameter");
        System.out.println(" Two Value:" + a);
    }

    double test(double a) {
        System.out.println("Overload with one  parameter with return value");
        System.out.println("Value:" + a);
        return a * a;
    }

}

class Poly1 {
    public static void main(String args[] ) {
        Poly obj = new Poly();
        double result;
        obj.test();
        obj.test(10);
        obj.test(10, 20);
        result = obj.test(12.2);
        System.out.println("Retuning Value: " + result);
    }

}
