package mypackage;

public class Samepackage {
 
      public Samepackage()
    {
        protection p = new protection();
        System.out.println("Same Package constructor");
        System.out.println("n=" +p.n);
        //System.out.println("n_private=" +p.n_private);
        System.out.println("n_protected=" +p.n_protected);
        System.out.println("n_public=" +p.n_public);
    }

}

