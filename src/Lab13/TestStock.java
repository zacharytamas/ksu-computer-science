package Lab13;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 13

public class TestStock {

    public static void main(String[] args) {

        Stock ORCL = new Stock("ORCL", "Oracle");
        ORCL.previousClosingPrice = 34.5;
        ORCL.currentPrice = 34.35;
        System.out.printf("ORCL change is %.2f%%\n", ORCL.getChangePercent());

        Stock MSFT = new Stock("MSFT", "Microsoft");
        MSFT.previousClosingPrice = 56.57 - .77;
        MSFT.currentPrice = 56.57;
        System.out.printf("MSFT change is %.2f%%\n", MSFT.getChangePercent());

        Stock GOOG = new Stock("GOOG", "Alphabet");
        GOOG.previousClosingPrice = 738.63;
        GOOG.currentPrice = 742.74;
        System.out.printf("GOOG change is %.2f%%\n", GOOG.getChangePercent());

    }

}
