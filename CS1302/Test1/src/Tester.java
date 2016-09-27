import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zacharytamas on 9/27/16.
 */
public class Tester {

    public static void main(String[] args) {

        // Thought about initializing this with a List but this is more
        // explicit and doesn't create an extra List in memory.
        ArrayList<String> names = new ArrayList<>();
        names.add("Abel");
        names.add("Charlie");
        names.add("Baker");

        for (String name : names) {
            System.out.printf("%s\t%d\n", name, name.length());
        }

    }

}
