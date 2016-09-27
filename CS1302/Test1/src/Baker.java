public class Baker extends Abel {
    private int y;

    public Baker(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void f() {
        System.out.println("f in Baker x is " + getX() + " y is " + y);
    }

    public void h() {
        System.out.println("h in Baker x is " + getX() + " y is " + y);
    }
}

