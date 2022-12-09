package lambda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    void TestStudents(ArrayList<Students> a1, Predicate<Students> pr) {
        for (Students s : a1
        ) {
            if (pr.test(s)) {
                System.out.println(s);
            }

        }
    }
//
//     void printStudentsOverGrade(ArrayList<Students> a1, double grade){
//         for (Students s:a1) {
//             if (s.avarageGrade>grade){
//                 System.out.println(s);
//             }
//         }
//     }
//    void printStudentsUnderAge(ArrayList<Students> a1, int age) {
//        for (Students s : a1) {
//            if (s.age < age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Students> a1, int age, double grade, char sex) {
//        for (Students s : a1) {
//            if (s.age > age && s.avarageGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//
//        }

}

class Test {
    public static void main(String[] args) {
        Students s1 = new Students("Ivan", 'm', 22, 3, 8.3);
        Students s2 = new Students("Nikolai", 'm', 28, 2, 6.4);
        Students s3 = new Students("Elena", 'f', 19, 1, 8.9);
        Students s4 = new Students("Petr", 'm', 35, 4, 7);
        Students s5 = new Students("Marya", 'f', 23, 3, 9.1);
        ArrayList<Students> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
//        StudentInfo studentInfo = new StudentInfo();

//            Collections.sort(students, new Comparator<Students>() {
//                @Override
//                public int compare(Students s1, Students s2) {
//                    return s1.course-s2.course;
//                }
//            });
//            Collections.sort(students, (stud1,stud2) ->stud1.course- stud2.course );
//            System.out.println(students);
//            studentInfo.TestStudents(students, new checkOverGrade());
//            studentInfo.TestStudents(students, new StudentCheck() {
//                @Override
//                public boolean check(Students s) {
//                    return s.age<30;
//                }
//            });
//        studentInfo.TestStudents(students, (Students s) -> {
//            return s.age < 30;
//        });
//        System.out.println("--------------------------------");
//        studentInfo.TestStudents(students, (Students s) -> {
//            return s.avarageGrade < 9;
//        });
//        studentInfo.TestStudents(students, p -> p.avarageGrade < 9);
//
//        Predicate<Students> p1 = Students -> Students.avarageGrade > 7.5;
//        Predicate<Students> p2 = Students -> Students.sex == 'm';
//        studentInfo.TestStudents(students, p1.and(p2));
//        studentInfo.TestStudents(students, p1.or(p2));
//        studentInfo.TestStudents(students, p1.negate()); //отрицание этой проверки


//        System.out.println("--------------------------------");
//        studentInfo.TestStudents(students, (Students s) -> {
//            return s.sex == 'f' && s.course < 3 && s.avarageGrade > 5;
//        });
//            studentInfo.printStudentsOverGrade(students, 8);
//            System.out.println("----------------");
//            studentInfo.printStudentsUnderAge(students, 30);
//            System.out.println("----------------");
//            studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');
        Function<Students, Double> f = students1 -> students1.avarageGrade;
        double res = avgOfSmth(students, students1 -> students1.avarageGrade);
        double res1 = avgOfSmth(students, students1 -> (double)students1.course);
        double res2 = avgOfSmth(students, students1 -> (double)students1.age);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);


    }
    private static double avgOfSmth(List<Students> list, Function<Students,Double> f){
        double result = 0;
        for (Students st: list){
            result+=f.apply(st);
    }
        result= result/list.size();
        return result;

    }
}

//interface StudentCheck {
//    boolean check(Students s);
//}
//
//class checkOverGrade implements StudentCheck {
//    @Override
//    public boolean check(Students s) {
//        return s.avarageGrade > 8;
//    }
//}

