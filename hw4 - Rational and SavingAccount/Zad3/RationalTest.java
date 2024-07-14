package Zad3;
public class RationalTest {
    public static void main(String[] args) {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 3);
        Rational z = x.add(y);
        System.out.println(z);
        // 1/2 + 1/3 = 5/6
    }
}
