package geometry;

/**
 * Created by zacharytamas on 8/25/16.
 */
public class TriangleTest {

    public static void main(String[] args) {

        Point a = new Point(1, 1);
        Point b = new Point(4, 1);
        Point c = new Point(1, 4);

        Triangle triangle = new Triangle(a, b, c);

        System.out.printf("a = (%f, %f)\n", a.getX(), a.getY());
        System.out.printf("b = (%f, %f)\n", b.getX(), b.getY());
        System.out.printf("c = (%f, %f)\n", c.getX(), c.getY());
        System.out.println();
        System.out.printf("Area of triangle formed: %f", triangle.area());

    }

}
