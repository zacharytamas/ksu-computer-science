package geometry;

/**
 * Created by zacharytamas on 8/25/16.
 */
public class PointTest {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);

        System.out.printf("Point a: (%f, %f)\n", a.getX(), a.getY());
        System.out.printf("Point b: (%f, %f)\n", b.getX(), b.getY());
        System.out.printf("Distance: %f\n", a.distance(b));
    }

}
