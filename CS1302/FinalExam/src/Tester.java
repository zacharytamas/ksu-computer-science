/**
 * Created by zachary on 12/8/16.
 */
public class Tester {

    interface A {
        String a = "a";
    }

    interface Z {
        String z = "z";
    }

    interface B extends A {
        String b = "b";
    }

    interface C extends B, Z {

    }

    public static void main(String[] args) {
        System.out.println(vbrf(10000));

    }

    public static int vbrf(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 4;

        return (3 * vbrf(n - 1)) - (3 * vbrf(n - 2)) + vbrf(n - 3);
    }

}
