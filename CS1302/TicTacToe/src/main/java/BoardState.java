/**
 * Created by zacharytamas on 11/8/16.
 */
public class BoardState {

    static final int LENGTH = 9;
    private char[] state;

    public BoardState(char[] state) {
        if (state != null) {
            this.state = state;
        } else {
            this.state = new char[9];
        }
    }

    public char[] getState() {
        return state;
    }
}
