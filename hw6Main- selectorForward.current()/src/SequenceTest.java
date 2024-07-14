import Zad2.SelectorBackward;
import Zad2.SelectorForward;
import Zad2.Sequence;

import java.util.Random;

public class SequenceTest {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(8);
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            sequence.add(rand.nextInt(91) + 10);
        }
        SelectorForward selectorForward = sequence.getSelectorForward();
        System.out.println("Forward: ");
        while (!selectorForward.end()) {
            System.out.print(selectorForward.current()+" ");
            selectorForward.next();
        }
        SelectorBackward selectorBackward = sequence.getSelectorBackward();
        System.out.println("\nBackward: ");
        while (!selectorBackward.begin()){
            System.out.print(selectorBackward.current()+" ");
            selectorBackward.previous();
        }
    }
}
