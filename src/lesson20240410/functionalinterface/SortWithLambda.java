package lesson20240410.functionalinterface;

import lesson20240318.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Smith", 23, 40);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30);
        Employee employee3 = new Employee("Inna", "Smith", 32, 20);
        Employee employee4 = new Employee("Mark", "Smith", 47, 40);
        Employee employee5 = new Employee("John", "Smith", 23, 40);
        Employee employee6 = new Employee("Inna", "Smith", 12, 20);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);


        Collections.sort(employees, (o1, o2) -> o1.getAge() - o2.getAge());
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        System.out.println(employees);
    }



}
