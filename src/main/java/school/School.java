package school;

import java.util.List;

public class School {

    public static void addHonorStudents(List<? super HonorStudent> ls) {
        HonorStudent hs = null;
        ls.add(hs);
        // Not legal for ? super
//        HonorStudent oneSmartie = ls.get();
    }

    public static void showAllStudent(List<? extends Student> ls) {
        for (Student s : ls) {
            System.out.println("> " + s);
        }
        // cannot do this because of the ? extends Student constraint
//        Student s = null;
//        ls.add(s); // NOT SAFE FOR List<HonorStudent>
    }
    public static void main(String[] args) {
        List<Student> roster = null;

        List<HonorStudent> smarties = null;

        // NOT ALLOWED in simple form...
        // because callee (showAllStudent) might add a regular Student
        showAllStudent(smarties);

        addHonorStudents(roster);
        addHonorStudents(smarties);
        List<Object> things = null;
        addHonorStudents(things);

    }
}
