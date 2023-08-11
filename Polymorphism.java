class Polymorphism {
    double width, height, depth;

    Polymorphism() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Polymorphism(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Polymorphism(double len) {
        width = height = depth = len;
    }

    double volume() {
        return (width * height * depth);
    }
}

class PolymorphismCons {
    public static void main(String args[]) {
        Polymorphism Box1 = new Polymorphism(50);
        Polymorphism Box2 = new Polymorphism(10, 20, 30);
        Polymorphism Box3 = new Polymorphism(10);
        double vol;
        vol = Box1.volume();
        System.out.println("Volume 1 is:" + vol);
        vol = Box2.volume();
        System.out.println("Volume 2 is:" + vol);
        vol = Box3.volume();
        System.out.println("Volume 3 is:" + vol);
    }
}
