import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopierReader {

    static final String FILE_NAME = "src/copier.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String productName = scanner.next();
                Double productCost = scanner.nextDouble();
                Integer productQuantity = scanner.nextInt();

                System.out.printf("%s\t%.2f\n", productName, productCost * productQuantity);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
