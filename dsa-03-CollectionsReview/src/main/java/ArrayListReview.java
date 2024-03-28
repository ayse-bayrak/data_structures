import org.w3c.dom.ls.LSOutput;

import java.rmi.StubNotFoundException;
import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        // Create ArrayList and a class
        List<Student> students =  new ArrayList<>();
        // I have created an ArrayList consisting of Student type Object

        // Add elements to ArrayList

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        // Iteration on ArrayList
        //1. For Loop with get(index)
        System.out.println("Printing with legacy for-loop..........");
        for (int i = 0; i < students.size() ; i++) {
            System.out.println(students.get(i));
        }

        //2. Iterator
        //Forward Iteration
        System.out.println("Printing with iterator..........");

        Iterator iter = students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            }

        //Backwards Iteration
        System.out.println("Printing Backwards with iterator");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        //3. for each loop
        System.out.println("Printing Backwards with for each loop");
        for (Student student: students) {
            System.out.println(student);
        }

        //4. Lambda
        System.out.println("Printing Backwards with lambda");
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting with Comparator Interface by Id Desc");
        //Sorting Elements in List using comparator interface
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting with Comparator Interface by Name Desc");
        //Sorting Elements in List using comparator interface
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student -> System.out.println(student));

        }
// implementation of Computer
        static class sortByIdDesc implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id-o2.id;
    }
}

    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareTo(o1.name);
        }

    }


    }



