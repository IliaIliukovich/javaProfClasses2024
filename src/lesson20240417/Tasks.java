package lesson20240417;

import lesson20240318.Employee;

import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
    // 1. Отсортировать с помощью стримов список из строк
    //- по алфавиту
    //- в обратном порядке


    //2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений



    //3. Создать список из экземпляров класса Employee. С помощью стримов:
    //- вывести список активных сотрудников старше 20 лет
    //- вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
    //- вывести список фамилий сотрудников с именем John
    //- вывести список всех уникальных имен сотрудников
        Employee employee1 = new Employee("John", "Smith", 23, 40, true);
        Employee employee2 = new Employee("Jane", "Smith", 45, 30, false);
        Employee employee3 = new Employee("Inna", "Smith", 32, 20, true);
        Employee employee4 = new Employee("Mark", "Smith", 47, 40, false);
        Employee employee5 = new Employee("John", "Smith", 23, 40, true);
        Employee employee6 = new Employee("Inna", "Smith", 12, 20, false);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

    }



}
