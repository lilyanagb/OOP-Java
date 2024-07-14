package Zad3;
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this(1, 1);
    }

    public Rational(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
        reduce();
    }

    public Rational(Rational rational){
        this(rational.numerator,rational.denominator);
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator=numerator;
    }
    public void setDenominator(int denominator){
        if(denominator != 0){
            this.denominator=denominator;
        }
    }
    public String toString() {
        if (denominator == 1) {
            return "" + numerator;
        } else {
            return numerator + "/" + denominator;
        }
    }
    public Rational add(Rational other) {
        return new Rational(numerator * other.getDenominator() + other.getNumerator()
                * denominator, denominator * other.getDenominator());
    }

    public Rational subtract(Rational other) {
        return new Rational(numerator * other.getDenominator() - other.getNumerator()
                * denominator, denominator * other.getDenominator());
    }

    public Rational multiply(Rational other) {
        return new Rational(numerator * other.getNumerator(),
                denominator * other.getDenominator());
    }

    public Rational divide(Rational other) {
        return new Rational(numerator * other.getDenominator(),
                denominator * other.getNumerator());
    }

    private void reduce() {
        if (denominator < 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
        int gcd = gcd(Math.abs(numerator), denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
