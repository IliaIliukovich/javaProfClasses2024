package lesson20240617;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class Student {

    private String name;

    private String surname;

    private int age;

    public static void main(String[] args) {
        Student student = new Student();
        student = new Student("Name", "Surname", 20);
        student.setName("Tom");
        System.out.println(student.getName());
    }

}
