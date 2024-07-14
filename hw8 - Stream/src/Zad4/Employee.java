/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad4;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

/**
 *
 * @author eck
 */
class Employee {

    public static enum Gender {

        MALE, FEMALE
    }

    private String name;
    private Gender gender;
    private LocalDate dob;
    private double income;
    private UUID uuid;

    private Employee(String name, Gender gender, LocalDate dob,
            double income) {
        
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.income = income;
        //a
        this.uuid=UUID.randomUUID();
    }

    public Employee() {
    }

    public double getIncome() {
        return income;
    }

    public static List<Employee> persons() {
        Employee p1 = new Employee( "Jake", Gender.MALE, LocalDate.of(1971,
                Month.JANUARY, 1), 2343.0);
        Employee p2 = new Employee("Jack", Gender.MALE, LocalDate.of(1972,
                Month.JULY, 21), 7100.0);
        Employee p3 = new Employee( "Jane", Gender.FEMALE, LocalDate.of(1973,
                Month.MAY, 29), 5455.0);
        Employee p4 = new Employee("Jode", Gender.MALE, LocalDate.of(1974,
                Month.OCTOBER, 16), 1800.0);
        Employee p5 = new Employee( "Jeny", Gender.FEMALE, LocalDate.of(1975,
                Month.DECEMBER, 13), 1234.0);
        Employee p6 = new Employee( "Jason", Gender.MALE, LocalDate.of(1976,
                Month.JUNE, 9), 3211.0);

        List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        return persons;
    }

    //c
    public static void statistics() {
    double sum=persons().stream().mapToDouble(o->o.getIncome()).sum();
        System.out.println(sum);
    }

    //d
    public void personsStatsByGenderCount(){
        Stream<Employee> female=persons().stream().filter(o->o.gender==Gender.FEMALE);
        System.out.printf("Female: %d\n",female.count());

        Stream<Employee> male=persons().stream().filter(o->o.gender==Gender.MALE);
        System.out.printf("Male: %d\n",male.count());

    }

    //e
    public void personsStatsByGenderList(){
        Stream<Employee> female=persons().stream().filter(o->o.gender==Gender.FEMALE);
        female.toList().forEach(i-> System.out.println(i.gender+" "));

        Stream<Employee> male=persons().stream().filter(o->o.gender==Gender.MALE);
        male.toList().forEach(i-> System.out.println(i.gender+" "));
    }

    //b
    @Override
    public String toString() {
        return  "name='" + name + ", gender=" + gender +
                ", dob=" + dob + ", income=" + income +
                ", uuid=" + uuid;
    }
}

