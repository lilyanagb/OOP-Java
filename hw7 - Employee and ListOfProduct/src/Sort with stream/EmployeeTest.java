package problem6;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    List<Employee> employees;
    //Before
    public void setup() {
      /*  employees = new ArrayList<>();
        employees.add(new Employee(123, "Jack", "Johnson", LocalDate.of(1988,
                Month.APRIL, 12)));
        employees.add(new Employee(345, "Cindy", "Bower", LocalDate.of(2011,
                Month.DECEMBER, 15)));
        employees.add(new Employee(567, "Perry", "Node", LocalDate.of(2005,
                Month.JUNE, 07)));
        employees.add(new Employee(467, "Pam", "Krauss", LocalDate.of(2005,
                Month.JUNE, 07)));
        employees.add(new Employee(435, "Fred", "Shak", LocalDate.of(1988,
                Month.APRIL, 17)));
        employees.add(new Employee(678, "Ann", "Lee", LocalDate.of(2007,
                Month.APRIL, 12)));*/
    }

    public void sortAscendingNumber(){
        employees.stream().sorted(Comparator.comparing(Employee::getEmployeeNumber))
                .forEach(System.out::println);
    }

    public void sortDescendingNumber(){
        employees.stream()
                .sorted((e1,e2)->e1.getHireDate().compareTo(e2.getHireDate()))
                .forEach(System.out::println);
    }
    
    public static void main(String[] args){
        EmployeeTest test=new EmployeeTest();
        test.setup();

        //1
        System.out.println("By number: ");
        test.sortAscendingNumber();

        //2
        System.out.println("By hire: ");
       // test.
    }

   /* Result result=JUnitCore.runClasses(EmployeeTest.class);
    for(Failure failure: result.getFailures()){
        System.out.println(failure.toString());
    }
    System.out.println(result.wasSuccessful());*/

}
