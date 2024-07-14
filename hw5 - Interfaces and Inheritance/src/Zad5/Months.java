package Zad5;

public enum Months {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(9),
    OCT(10),
    NOV(11),
    DEC(12);

    public static Months[] Month=Months.values();

    private final int number;

    Months (int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String toString(){
        switch(this){
            case JAN:
                return "January";
            case FEB:
                return "February";
            case MAR:
                return "March";
            case APR:
                return "April";
            case MAY:
                return "May";
            case JUN:
                return "June";
            case JUL:
                return "July";
            case AUG:
                return "August";
            case SEP:
                return "September";
            case OCT:
                return "October";
            case NOV:
                return "November";
            case DEC:
                return "December";
            default:
                return null;
        }
    }


}
