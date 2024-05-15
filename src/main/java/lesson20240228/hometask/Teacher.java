package lesson20240228.hometask;

public class Teacher {
    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach(Student student) {
//        student.learn(subject);
        boolean[] studiedSubjects = student.getStudiedSubjects();
        studiedSubjects[subject.ordinal()] = true;
    }





}
