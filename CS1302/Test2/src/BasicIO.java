import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zacharytamas on 11/3/16.
 */
public class BasicIO {

    static final String FILE_NAME = "test2.txt";

    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter(FILE_NAME);
            printWriter.println("Xyz 200 .75");
            printWriter.println("Abc 1000 2.7");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
