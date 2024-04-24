package lesson20240424;

import lesson20240318.Employee;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples {

    public static void main(String[] args) {

        Object o;
        o = 2;
        o = "String";

        System.out.println(((String) o).toUpperCase());

        List list = new ArrayList();

        List<String> stringList = new ArrayList<String>();
        new ArrayList<String>().add("123");

        GenericClass<Integer, Object> genericClass1 = new GenericClass<>(123);
        genericClass1.process("input1");

        GenericClass<String, Employee> genericClass2 = new GenericClass<>("string data");
        genericClass2.process("input2");

        System.out.println(genericClass1.function(10));
        System.out.println(genericClass2.function("sting value"));

        Object object = genericClass1.methodWithM(new Object());
        Employee employee = genericClass2.methodWithM(new Employee("Tom", "Smith", 43, 40));

    }



}
