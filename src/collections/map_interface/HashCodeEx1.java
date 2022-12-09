package collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map <Students, Double> map = new HashMap<>();
        Students s1 = new Students("Zaur", "Tregulov", 4);
        Students s2 = new Students("Evgeniy", "Yugrin", 2);
        Students s3 = new Students("Anton", "Antonov", 1);
        map.put(s1, 7.5);
        map.put(s2, 2.3);
        map.put(s3, 10.1);
        System.out.println(map);

        Students s4 = new Students("Zaur", "Tregulov", 4);
        Students s5 = new Students("Igor", "Sidorov", 6);
//        boolean result = map.containsKey(s4);
//        System.out.println("result = " + result );
        System.out.println(s1.hashCode());
        for (Map.Entry<Students, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }
}

    class Students implements Comparable <Students> {
        String name;
        String surname;
        int course;


        public Students(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;

        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Students students = (Students) o;
            return course == students.course &&
                    Objects.equals(name, students.name) &&
                    Objects.equals(surname, students.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, course);
        }

        @Override
        public int compareTo(Students o) {
            return this.name.compareTo(o.name);
        }
        //        @Override
//        public int hashCode() {
//        return name.length()*7 + surname.length()*11 +course*53;
//
//        }
    }
