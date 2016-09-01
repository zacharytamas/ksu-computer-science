package geometry;

/**
 * Created by zacharytamas on 8/25/16.
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double area() {
        double a = this.a.distance(this.b);
        double b = this.a.distance(this.c);
        double c = this.b.distance(this.c);

        double s = (a + b + c) / 2.0;
        double delta = (s * (s - a) * (s - b) * (s - c));
        return Math.sqrt(delta);
    }
}
