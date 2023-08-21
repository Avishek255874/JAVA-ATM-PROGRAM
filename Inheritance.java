public class Inheritance {

    int i, j;

    void showij() {
        System.out.println("value of i and j:" + i + "" + j);
    }

}

class child extends Inheritance {
    int k;

    void showk() {
        System.out.println("k:" + k);
    }

    void sum() {
        System.out.println("i+j+k:" + (i + j + k));

    }
}

class DemoChild {
    public static void main(String args[]) {
        Inheritance SuperObj = new Inheritance();
        child subObj = new child();

        SuperObj.i = 100;
        SuperObj.j = 20;

        System.out.println("Content of super object :");

        SuperObj.showij();
        subObj.i = 50;
        subObj.j = 60;
        subObj.k = 70;

        System.out.println("Content of Sub object :");

        subObj.showij();
        subObj.showk();
        subObj.sum();

    }

}
