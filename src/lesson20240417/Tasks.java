package lesson20240417;

import lesson20240318.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        // 1. Отсортировать с помощью стримов список из строк
        //- по алфавиту
        //- в обратном порядке
        List<String> stringList = Arrays.asList("Hello", "World", "Abc", "Cba");
        List<String> resultStringList = stringList.stream().sorted().toList();
        System.out.println(resultStringList);
        resultStringList = stringList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(resultStringList);


        //2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
        List<Integer> integerList = Arrays.asList(12, 32, 11, 25, 0);
        List<String> result = integerList.stream().map(Object::toString).toList();
        System.out.println(result);


        //3. Создать список из экземпляров класса Employee. С помощью стримов:
        Employee employee1 = new Employee("John", "Smith", 23, 40, true);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30, false);
        Employee employee3 = new Employee("Inna", "Smith", 32, 20, true);
        Employee employee4 = new Employee("Mark", "Smith", 47, 40, false);
        Employee employee5 = new Employee("John", "Smith", 23, 40, true);
        Employee employee6 = new Employee("Inna", "Smith", 12, 20, false);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        //- вывести список активных сотрудников старше 20 лет
        List<Employee> list = employees.stream().filter(employee -> employee.isActive() && employee.getAge() > 20).toList();
        System.out.println(list);

        //- вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
        list = employees.stream().filter(employee -> employee.getWorkingHoursInMonth() > 30 && employee.getName().startsWith("J")).toList();
        System.out.println(list);

        //- вывести список фамилий сотрудников с именем John
        List<String> surnames = employees.stream().filter(employee -> employee.getName().startsWith("John")).map(Employee::getSurname).toList();
        System.out.println(surnames);

        //- вывести список всех уникальных имен сотрудников
        List<String> uniqueNames = employees.stream().map(Employee::getName).distinct().toList();
        System.out.println(uniqueNames);
    }



}
