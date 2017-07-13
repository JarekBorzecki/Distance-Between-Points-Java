package Practice_7;

/**
 * Created by jarek on 13.07.2017.
 */
public class PointMain {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println(p1.makeString()); // (0, 0)
        System.out.println(p2.makeString()); // (3, 4)

        if (p1.isEqualTo(p2)) {
            System.out.println("These two points are equal");
        }

        double dist = p1.distanceTo(p2);
        System.out.println("Point Distance: " + dist);

        p2.move(5, -2); // (8, 2)
        p1.moveToXY(8, 2); // (8, 2)

        if (p1.isEqualTo(p2)) {
            System.out.println("These two points are equal");
        }
    }
}
