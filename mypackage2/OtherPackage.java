package mypackage2;
import mypackage.protection;

  public class  OtherPackage
{
    OtherPackage()
    {
        mypackage.protection p =new mypackage.protection();
        System.out.println(" other package constructor");
        // System.out.println("n=" +p.n);
       //  System.out.println("n_private=" +p.n_private);
        //System.out.println("n_protected=" + p.n_protected);
        System.out.println("n_public=" + p.n_public);
    }
}
