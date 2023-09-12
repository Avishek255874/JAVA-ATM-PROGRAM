package mypackage;

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

