package HW27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan",24,11.1);
        Student student2 = new Student("Sergiy",19,10.9);
        Student student3 = new Student("Kiril",23,9.8);
        Student student4 = new Student("Yehor",20,10.4);
        Student student5 = new Student("Artem",25,11.2);
        ArrayList<Student> students = new ArrayList<>(List.of(student1,student2,student3,student4,student5));

        List<Student> newStudents= students.stream()
                .filter(student->student.getAge()>22)
                .collect(Collectors.toList());
        for (Student student: newStudents){
            System.out.println(student);
        }

        System.out.println("=====================================");

        List<String> names = students.stream()
                .map(student -> student.name)
                .collect(Collectors.toList());
        for (String name: names){
            System.out.println(name);
        }

        System.out.println("=====================================");

        Integer age = students.stream()
                .map(student->student.getAge())
                .reduce(0,(acc,curr)->acc+curr);
        System.out.println(age);
    }
}
