package problem2;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public double getPreviousClosingPrice() {
        return this.previousClosingPrice;
    }

    public double getCurrentPrice() {
        return this.currentPrice;
    }

    public void setPreviousClosingPrice(double price) {
        if (price > 0) {
            previousClosingPrice = price;
        } else {
            previousClosingPrice = 0;
        }
    }

    public void setCurrentPrice(double price) {
        if (price > 0) {
            currentPrice = price;
        } else {
            currentPrice = 0;
        }
    }

    public double changePercent() {
        if (previousClosingPrice != 0 && currentPrice != 0) {
            return currentPrice / previousClosingPrice;
        } else  {
            return 0;
        }
    }
}
