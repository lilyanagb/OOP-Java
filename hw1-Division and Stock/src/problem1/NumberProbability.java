package problem1;

public class NumberProbability {

    private int allCount;
    private int countWithProperties;
    private double probability;

    public void count() {
        int allCount = 0;
        int countWithProperties = 0;
        for (int firstDigit = 3; firstDigit <= 9; firstDigit++) {
            for (int secondDigit = 2; secondDigit <= 8; secondDigit++) {
                for (int thirdDigit = 4; thirdDigit <= 9; thirdDigit++) {
                    for (int fourthDigit = 1; fourthDigit <= 6; fourthDigit++) {
                        for (int fifthDigit = 6; fifthDigit <= 9; fifthDigit++) {
                            allCount++;
                            if (isDivisibleByThree(firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit)
                            && isDivisibleByFour(fifthDigit + (10 * fourthDigit))) {
                                countWithProperties++;
                            }
                        }
                    }
                }
            }
        }
        setAllCount(allCount);
        setCountWithProperties(countWithProperties);
        setProbability((double)countWithProperties / (double)allCount);
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFour(int number) {
        return number % 4 == 0;
    }

    public void setProbability(double probability) {
        if (probability >= 0) {
            this.probability = probability;
        } else {
            this.probability = 0;
        }
    }


    public void setAllCount(int allCount) {
        if (allCount >= 0) {
            this.allCount = allCount;
        } else {
            this.allCount = 0;
        }
    }

    public void setCountWithProperties(int countWithProperties) {
        if (countWithProperties >= 0) {
            this.countWithProperties = countWithProperties;
        } else {
            this.countWithProperties = 0;
        }
    }

    public int getAllCount() {
        return allCount;
    }

    public int getCountWithProperties() {
        return countWithProperties;
    }

    public double getProbability() {
        return probability;
    }
}
