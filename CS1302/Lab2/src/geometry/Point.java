package geometry;

/**
 * Created by zacharytamas on 8/25/16.
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(this.x - p2.getX(), 2) +
                         Math.pow(this.y - p2.getY(), 2));
    }
}
