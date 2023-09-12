package mypackage2;

public class protection2 extends mypackage.protection {
    protection2() {
        System.out.println("Derives other package constructor");
        // System.out.println("n=" +n);
        // System.out.println("n_private=" +n_private);
        System.out.println("n_protected= " + n_protected);
        System.out.println("n_public= " + n_public);
    }

}
