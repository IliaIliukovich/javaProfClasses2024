package lesson20240313;

import java.util.List;

public class School {

    // Составить список студентов, распределенных по отдельным классам List<List<Student>> studentGrades
    //- Написать метод countTotalAmount(studentGrades), который считает общее число студентов
    //- Написать метод countAmountWithName(studentGrades, name),
    // который считает количество студентов в школе с заданным именем name.

    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 14);
        Student student2 = new Student("Petya", 14);
        Student student3 = new Student("Tom", 16);
        Student student4 = new Student("Jane", 16);
        Student student5 = new Student("Mark", 14);
        Student student6 = new Student("David", 11);
        Student student7 = new Student("Mary", 11);
        Student student8 = new Student("Tom", 12);
        Student student9 = new Student("Steve", 15);
        Student student10 = new Student("Julia", 10);

        List<Student> group1 = List.of(student1, student2, student3);
        List<Student> group2 = List.of(student4, student5, student6);
        List<Student> group3 = List.of(student7, student8, student9, student10);
        List<List<Student>> studentGrades = List.of(group1, group2, group3);

        System.out.println(countTotalAmount(studentGrades));
        System.out.println(countAmountWithName(studentGrades, "Tom"));
    }

    public static int countTotalAmount(List<List<Student>> studentGrades){
        int counter = 0;
        for (List<Student> studentList : studentGrades) {
            counter += studentList.size();
        }
        return counter;
    }

    public static int countAmountWithName(List<List<Student>> studentGrades, String name){
        int counter = 0;
        for (List<Student> studentList : studentGrades) {
            for (Student student : studentList){
                if (student.getName().equals(name)) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
