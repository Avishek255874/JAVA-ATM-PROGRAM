public class SqureBox {
    double a,b;

    double SquareFunction() {
        return (a*2+2*a*b+b*2);
    }

    public static void main(String[] args) {
        SqureBox FindSquare = new SqureBox(); // Corrected the class name and object creation
      

        
        FindSquare.a = 10; // Corrected the syntax for setting the width of myBox2
        FindSquare.b = 5; // Corrected the syntax for setting the depth of myBox2

        double sqr;
        sqr= FindSquare.SquareFunction();
        System.out.println("Volume of Box-1 is: " + sqr);
       
     
    }
}

