public class Abel {
    private int x;

    public Abel(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void f() {
        System.out.println("f in Abel x is " + x);
    }

    public void g() {
        System.out.println("g in Abel x is " + x);
    }
}