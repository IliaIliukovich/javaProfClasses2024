package lesson20240228.hometask;

import java.util.Arrays;

public class School {

    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Mrs. Smith", Subject.MATHS);
        Teacher physicsTeacher= new Teacher("Mr. Thompson", Subject.PHYSICS);

        Student student1 = new Student("Harry");
        mathTeacher.teach(student1);
        mathTeacher.teach(student1);
        physicsTeacher.teach(student1);

        System.out.println(student1.knows(Subject.MATHS));
        System.out.println(student1.knows(Subject.PHYSICS));
        System.out.println(student1.knows(Subject.LITERATURE));
        System.out.println(Arrays.toString(student1.getStudiedSubjects()));
    }


}
