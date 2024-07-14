package Zad5;

public class MonthsTest {
    public static void main(String[] args) {
        System.out.print("Months: ");
        for(Months month: Months.values()) {
            System.out.print(month.name() + " ");
        }
        Months month=Months.JAN;

        System.out.println();
        System.out.println(month.toString());

        System.out.println(Months.Month[10]);
    }
}
