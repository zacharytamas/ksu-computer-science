/**
 * Created by zacharytamas on 8/18/16.
 */
public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] calculate() {
        double[] result = new double[2];
        double discriminant = calculateDiscriminant();
        result[0] = calculateX(discriminant, 1);
        result[1] = calculateX(discriminant, -1);
        return result;
    }

    private double calculateDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private double calculateX(double discriminant, double sign) {
        return (-b + (Math.sqrt(discriminant) * sign)) / (2 * a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
