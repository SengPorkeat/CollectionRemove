package CollectionRemove1;

import java.util.*;

public class TestC1 {
    public static void main(String[] arg) {
        List<Student> studentList = new ArrayList<>();
        Random random = new Random();
//        System.out.println("Insert Class: ");
//        String[] classes = new Scanner(System.in).nextLine().split(",");
        Student student = new Student(
                random.nextInt(100),
                "Smos",
                new String[]{"DevOps","Java"},
                new String[]{"FontEnd"}
        );
        Student student2 = new Student(
                random.nextInt(100),
                "Smos",
                new String[]{"DevOps","Java"},
                new String[]{"FontEnd"}
        );
        studentList.add(student);
        studentList.add(student2);
        System.out.println(studentList);
        System.out.print("Input to Delete: ");
        Integer id = new Scanner(System.in).nextInt();

        //REMOVE 1
//        Iterator<Student> it = studentList.iterator();
//        while (it.hasNext()) {
//            Student s = it.next();
//            if(s.getId().equals(id)) {
//                it.remove();
//            }
//        }

        //REMOVE 2
        studentList.removeIf(s -> s.getId().equals(id));
        System.out.println(studentList);

        //REMOVE 3
//        Student deletedStudents = null;
//        for(Student s : studentList) {
//            if(s.getId().equals(id)) {
//                deletedStudents = s;
//            }
//        }
//        studentList.remove(deletedStudents);
    }
}
