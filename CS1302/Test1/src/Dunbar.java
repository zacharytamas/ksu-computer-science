/**
 * Created by zacharytamas on 9/27/16.
 */
public class Dunbar extends Argyll {
    private double extent;

    public void setExtent(double extent) {
        this.extent = extent;
    }

    public double getExtendedForce() {
        return this.extent * this.getQuadForce();
    }
}
