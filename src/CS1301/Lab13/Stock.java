package CS1301.Lab13;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 13

public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return (currentPrice / previousClosingPrice - 1.0) * 100;
    }

}
