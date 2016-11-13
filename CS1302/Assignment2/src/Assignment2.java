/**
 * Created by zacharytamas on 11/13/16.
 */
public class Assignment2 {

    /**
     * Return the maximum value, but no greater than limit, that can be
     * obtained by adding up elements from weights using those elements
     * from index 0 up to, but not including, index upTo.
     *
     * @param weights Positive numbers listed in increasing order.
     * @param limit Greater than or equal to 0
     * @param upTo Less than or equal to the length of the array weights
     *              and greater than or equal to 0
     * @return The maximum value that can be obtained.
     */
    public static int maximize(int[] weights, int limit, int upTo) {

        if (limit == 0 || upTo == 0) {
            return 0;
        }

        int currentItemWeight = weights[upTo - 1];
        int try1 = maximize(weights, limit, upTo - 1);

        // If the limit is less than this item's weight, skip it because
        // can't take it on.
        if (limit < currentItemWeight) {
            return try1;
        }

        int try2 = currentItemWeight + maximize(weights, limit - currentItemWeight, upTo - 1);

        return Math.max(try1, try2);
    }

    public static int maximize(int[] weights, int limit) {
        return maximize(weights, limit, weights.length);
    }

    public static void main(String[] args) {
        int[] weights = new int[]{19,30,130,137,173,182,209,225,259,260};
        System.out.println(maximize(weights, 1082));
        System.out.println(maximize(weights, 1574));
    }

}
