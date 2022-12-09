package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3,8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2,6.4);
        Student st3 = new Student("Elena", 'f', 19, 1,8.9);
        Student st4 = new Student("Petr", 'm', 35, 4,7);
        Student st5 = new Student("Mariya", 'f', 23, 3,7.4);

        Faculty f1 = new Faculty("Economic");
        Faculty f2 = new Faculty("Applauded Mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));


    }
}
class Faculty{
    String name;
    List<Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();

    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }
    public void addStudentToFaculty (Student st){
        studentOnFaculty.add(st);
    }
}
