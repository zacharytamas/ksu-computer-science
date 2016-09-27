/**
 * Created by zacharytamas on 9/27/16.
 */
public class Essex {

    private int ascent;
    private Kent base;

    public Essex(int ascent, Kent base) {
        this.ascent = ascent;
        this.base = base;
    }

    public int getApex() {
        return this.ascent + this.base.getFactor();
    }

}
