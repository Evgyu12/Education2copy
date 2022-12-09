package lambda;

public class Students {
    String name;
    char sex;
    int age;
    int course;
    double avarageGrade;

    public Students(String name, char sex, int age, int course, double avarageGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avarageGrade = avarageGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avarageGrade=" + avarageGrade +
                '}';
    }
}
