public class overloding {
    double width, height, depth;

    overloding() {
        width = -1;
        height = -1;
        depth = -1;
    }

    overloding(double width, double h, double d) {
        this.width = width;
        height = h;
        depth = d;
    }

    overloding(double len) {
        width = height = depth = len;
    }

    double volume() {
        return (width * height * depth);
    }

}

class OverLoading {
    public static void main(String args[]) {
        overloding load = new overloding();
        overloding load1 = new overloding(20, 60, 15);
        overloding load2 = new overloding(25);

        double vol;
        vol = load.volume();
        System.out.println("Volume 1 is :" + vol);
        vol = load1.volume();
        System.out.println("Volume 2 is :" + vol);
        vol = load2.volume();
        System.out.println("Volume 3 is :" + vol);

    }
}