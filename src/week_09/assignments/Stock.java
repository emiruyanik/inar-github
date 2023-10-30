package week_09.assignments;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        double changeBetweenTwoPrice = currentPrice - previousClosingPrice;
        return (changeBetweenTwoPrice / previousClosingPrice) * 100;
    }
}