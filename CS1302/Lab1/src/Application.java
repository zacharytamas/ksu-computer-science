/**
 * Created by zacharytamas on 8/18/16.
 */
public class Application {

    public static void main(String[] args) {
        double a = 3;
        double b = 5;
        double c = 2;

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] results = equation.calculate();
        System.out.printf("a = %f\n", a);
        System.out.printf("b = %f\n", b);
        System.out.printf("c = %f\n", c);
        System.out.println();
        System.out.printf("x1 = %f\n", results[0]);
        System.out.printf("x2 = %f\n", results[1]);
    }
}
