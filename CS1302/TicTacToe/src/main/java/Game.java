import java.util.HashMap;
import java.util.Map;

/**
 * Created by zacharytamas on 11/8/16.
 */
public class Game {

    private BoardState state;

    // ----------------------------------------------------------------
    // Game Rule Configuration

    /**
     * These are 9 bit representations of states on a TicTacToe board
     * that are a winning state.
     */
    public static final short[] WINNING_MASKS = {
            73, 146, 292,  // Vertical wins
            7, 56, 448,    // Horizontal wins
            273, 84        // Diagonal wins
    };

    // ----------------------------------------------------------------
    // Game events

    /**
     * @return Whether the current board state is a winning state.
     */
    public StateEvaluation evaluateState() {
        HashMap<Character, Integer> masks = new HashMap<Character, Integer>();
        masks.put('X', 0);
        masks.put('O', 0);

        for (int i = 0; i < BoardState.LENGTH; i++) {
            char cell = this.state.getState()[i];
            if (cell != 0) {
                // This builds up the 9 bit hash that represents the board
                // state for this player.
                masks.replace(cell, (masks.get(cell) | (1 << i)));
            }
        }

        for (int mask : WINNING_MASKS) {
            for (char player : masks.keySet()) {
                if ((masks.get(player) & mask) == mask) {
                    return new StateEvaluation(player, (short) mask);
                }
            }
        }

        // TODO(zjones) Add tie
        // TODO(zjones) Add default case



    }

    private class StateEvaluation {
        public char player;
        public short mask;

        public StateEvaluation(char player, short mask) {
            this.player = player;
            this.mask = mask;
        }
    }
}
