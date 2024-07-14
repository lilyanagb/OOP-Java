package Zad6;

public class Test extends B{
    static void printFirst(FirstInterface i){
        i.method1First();
        i.method2First();
    }

    static void printSecond(SecondInterface i){
        i.method1Second();
        i.method2Second();
    }

    static void printThird(ThirdInterace i){
        i.method1Third();
        i.method2Third();
    }

    static void printFour(Combination i){
        i.m();
        i.method1First();
        i.method2First();
        i.method1Second();
        i.method2Second();
        i.method1Third();
        i.method2Third();
    }
    public static void main(String[] args) {
        B check=new B();

        printFirst(check);
        System.out.println();
        printSecond(check);
        System.out.println();
        printThird(check);
        System.out.println();
        printFour(check);
    }
}
