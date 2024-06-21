package summary20240621.hometask;


import java.lang.reflect.Field;

public class School {

    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;

    private Object object;

//    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Double aDouble;

    public static void main(String[] args) {
        School school = new School();

        Injector.inject(school);

        System.out.println(school.student1);
        System.out.println(school.student2);
        System.out.println(school.object);
        System.out.println(school.aDouble);
    }

    static class Injector {
        public static void inject(Object instance) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(StudentInfo.class)) {
                    if (field.getType() == Student.class) {
                        StudentInfo annotation = field.getAnnotation(StudentInfo.class);
                        field.setAccessible(true); // should work on private fields
                        Student student = new Student();
                        student.setSurName(annotation.surname());
                        student.setName(annotation.name());
                        student.setAge(annotation.age());
                        try {
                            field.set(instance, student);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        throw new RuntimeException("@StudentInfo annotation cannot be use with " + field.getType());
                    }
                }
            }
        }
    }

}
