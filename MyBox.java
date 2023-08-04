public class MyBox {
    double width, depth, height;

    double volume() {
        return (width * depth * height);
    }

    public static void main(String[] args) {
        MyBox myBox1 = new MyBox(); // Corrected the class name and object creation
        MyBox myBox2 = new MyBox(); // Corrected the class name and object creation

        myBox1.width = 10; // Corrected the syntax for setting the width of myBox1
        myBox1.height = 20; // Corrected the syntax for setting the height of myBox1
        myBox1.depth = 5; // Corrected the syntax for setting the depth of myBox1

        myBox2.width = 10; // Corrected the syntax for setting the width of myBox2
        myBox2.height = 20; // Corrected the syntax for setting the height of myBox2
        myBox2.depth = 5; // Corrected the syntax for setting the depth of myBox2

        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of Box-1 is: " + vol);
        vol = myBox2.volume();
        System.out.println("Volume of Box-2 is: " + vol);
    }
}
