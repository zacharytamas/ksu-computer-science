/**
 * Created by zacharytamas on 9/27/16.
 */
public class Argyll {

    private double force;

    public void setForce(double force) {
        this.force = force;
    }

    public double getQuadForce() {
        return Math.pow(force, 2);
    }

}
