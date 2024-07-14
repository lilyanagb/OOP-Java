package hw5;

import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Homework {
    public static void main(String[] args) {
        //Zad1
       int max=10;
       int min=1;
       int range=max-min+1;
       int missing=0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
       while(list1.size() != 10){
           int rand=(int)(Math.random()*range)+min;
           if(!list1.contains(rand)) {
               list1.add(rand);
           }
           else {
               missing++;  //tries needed to collect all 10 eggs
           }
           }


        //Zad2
        Stream<String> stream2=Stream.of("aBc", "d", "ef", "123456")
                .map(String::toUpperCase).sorted();
        List<String> result=stream2.collect(Collectors.toList());
        result.forEach(System.out::println);


        //Zad3
        IntStream stream3= IntStream.range(1,101);
        Optional<String> string2 = stream3.mapToObj(i -> String.valueOf(i))
                .reduce((s1,s2)->s1+"#"+s2);

        System.out.println(string2.get());

        Random rand1=new Random();
        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<20;i++){
            list.add(rand1.nextInt(31));
        }

        list.stream().mapToInt(Integer::intValue).forEach(i-> System.out.printf("%d ",i));
        OptionalDouble average=list.stream().mapToDouble(a->a).average();

        /* System.out.print("\nSmaller than 15: ");
        list.stream().filter(x->x<15).forEach(i-> System.out.printf("%d ",i));
        System.out.print("\nDivided by 5: ");
        list.stream().filter(x->x%5 == 0).forEach(i-> System.out.printf("%d ",i));
        System.out.printf("\nBigger than %.2f: ",average.getAsDouble());
        list.stream().filter(x->x> average.getAsDouble()).forEach(i-> System.out.printf("%d ",i));
        */
        System.out.println();
        System.out.println(list.stream().allMatch(x->x<15));
        Predicate<Integer> predicate2= x->x%5 == 0;
        System.out.println(list.stream().anyMatch(predicate2));
        Predicate<Integer> predicate3= x->x> average.getAsDouble();
        System.out.println(list.stream().anyMatch(predicate3));
    }
}
