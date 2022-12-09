package collections;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchEx {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);
//        Employee1 emp1= new Employee1(100, "Zaur", 1233);
//        Employee1 emp2= new Employee1(15, "Ivan", 23123);
//        Employee1 emp3= new Employee1(1, "Igor", 1231554);
//        Employee1 emp4= new Employee1(5, "Anton", 54456);
//        Employee1 emp5= new Employee1(2, "Maksim", 4564223);
//        Employee1 emp6= new Employee1(19, "Evgeniy", 34354);
//        Employee1 emp7= new Employee1(130, "Kirill", 45361236);
//        List<Employee1> employee1List= new ArrayList<>();
//        employee1List.add(emp1);
//        employee1List.add(emp2);
//        employee1List.add(emp3);
//        employee1List.add(emp4);
//        employee1List.add(emp5);
//        employee1List.add(emp6);
//        employee1List.add(emp7);
//        System.out.println(employee1List);
//        Collections.sort(employee1List);
//        int index2 = Collections.binarySearch(employee1List,new Employee1(19, "Evgeniy", 34354));
//        System.out.println(index2);
//            int [] array = {-3, 8,12,-8,0,5,10,1,150,-30,19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array,150);
//        System.out.println(index3);


        }
}
class Employee1 implements Comparable <Employee1>{
    int id;
    String name;
    int salary;
    public Employee1 (int id, String name, int salary){
        this.id= id;
        this.name=name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee1 anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result ==0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return  result;
    }
}
