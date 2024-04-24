package lesson20240422;

import lesson20240318.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorExamples {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jane", "Martin", "Nik", "Edd", "Tom", "Jane", "Tom");
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());

        ArrayList<String> arrayList = names.stream().collect(Collectors.toCollection(ArrayList::new));

        Map<String, Integer> namesWithLength = names.stream().distinct().collect(Collectors.toMap(name -> name, String::length));
        System.out.println(namesWithLength);

        namesWithLength = names.stream().collect(Collectors.toMap(name -> name, String::length, (length1, length2) -> length1));
        System.out.println(namesWithLength);

        Map<String, Integer> namesCount = names.stream().collect(Collectors.toMap(name -> name, name -> 1, (el1, el2) -> el1 + el2));
        System.out.println(namesCount);

        // Создать список из экземпляров класса Employee.
        Employee employee1 = new Employee("Tim", "Smith", 23, 40, true, "IT");
        Employee employee2 = new Employee("Jane", "Smith", 45, 30, false, "STOCK");
        Employee employee3 = new Employee("Inna", "Smith", 32, 20, true, "IT");
        Employee employee4 = new Employee("Mark", "Smith", 47, 40, false, "ACCOUNTING");
        Employee employee5 = new Employee("John", "Smith", 23, 40, true, "STOCK");
        Employee employee6 = new Employee("Nina", "Smith", 12, 20, false, "IT");
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        //  С помощью коллекторов:
        // Map <Имя / Employee>
        Map<String, Employee> nameToEmployeeMap = employees.stream().collect(Collectors.toMap(Employee::getName, e -> e));
        System.out.println(nameToEmployeeMap);

        // Map <age / количество>
        Map<Integer, Integer> ageMap = employees.stream().collect(Collectors.toMap(Employee::getAge, age -> 1, Integer::sum));
        System.out.println(ageMap);
        Map<Integer, Long> ageMap2 = employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
        System.out.println(ageMap2);

        // Map <age / список сотрудников>
        Map<Integer, List<Employee>> employeesByAge = employees.stream().collect(
                Collectors.groupingBy(Employee::getAge, Collectors.mapping(e -> e, Collectors.toList())));
        System.out.println(employeesByAge);

        // Map <isActive / количество>
        Map<Boolean, Long> isActiveMap = employees.stream().collect(Collectors.partitioningBy(Employee::isActive, Collectors.counting()));
        System.out.println(isActiveMap);

        // Map <Department / список сотрудников>
        Map<String, List<Employee>> employeesByDepartment = employees.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(e -> e, Collectors.toList())));
        System.out.println(employeesByDepartment);

        // Map <Department / общая сумма рабочих часов>
        Map<String, Integer> workingHoursByDepartment = employees.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getWorkingHoursInMonth)));
        System.out.println(workingHoursByDepartment);

        String string = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
//        string = employees.stream().map(Employee::getName).reduce((s1, s2) -> s1 + ", " + s2).orElse("");
        System.out.println(string);

    }



}
