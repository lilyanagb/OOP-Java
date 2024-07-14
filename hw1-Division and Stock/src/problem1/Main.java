package problem1;

public class Main {

    public static void main(String[] args) {
        NumberProbability numberProbability = new NumberProbability();
        numberProbability.count();

        System.out.println(String.format("The total number of 5-digit numbers with the asked property is: %d%n" +
                "Of those numbers, the number of numbers divisible by 12 is: %d%n" +
                "The probability that a random number with the asked property will be divisible by 12 is %.2f%n",
                numberProbability.getAllCount(),
                numberProbability.getCountWithProperties(),
                numberProbability.getProbability()));
    }
}
