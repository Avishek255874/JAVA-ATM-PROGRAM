//package mypackage;


public class Packages {
    
    

public class protection {
    int n=1;
    private int n_private=2;
    protected int n_protected=3;
    public int n_public=4;

    public protection()
    {
        System.out.println("Base constructor");
        System.out.println("n=" +n);
        System.out.println("n_private=" +n_private);
        System.out.println("n_protected=" +n_protected);
        System.out.println("n_public=" +n_public);
    }

}


public class derived extends protection {

    derived() {

        System.out.println(" Derived constructor");
        System.out.println("n=" + n);
        // System.out.println("n_private=" +n_private); // You can't access n_private here since it's private
        System.out.println("n_protected=" + n_protected);
        System.out.println("n_public=" + n_public);

    }
}


public class Samepackage {
 
      public Samepackage()
    {
        protection p = new protection();
        System.out.println("Same Package constructor");
        System.out.println("n=" +p.n);
      //  System.out.println("n_private=" +p.n_private);  // You can't access n_private here since it's private
        System.out.println("n_protected=" +p.n_protected);
        System.out.println("n_public=" +p.n_public);
    }

}

public class Accesspackage {

    public static void main(String args[]) {
        protection obj = new protection();
        Samepackage obj3 = new Samepackage();
        derived obj2 = new derived();

    }

}

}
