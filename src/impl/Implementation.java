package impl;

import com.Student;

public class Implementation {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("aa");
        student.setDob("01 - 01 - 2000");
        student.setPhone(1234431);
        student.setCity("Delhi");
        student.setRollNo("ABC123");
        student.setGrade("12 class");
        student.setMarks(87);
        System.out.println(student.getRollNo());
        System.out.println(student.getName());
        System.out.println(student.getGrade());
        System.out.println(student.getDob());
        System.out.println(student.getPhone());
        System.out.println(student.getCity());
        System.out.println(student.getGrade());
        System.out.println(student.getMarks());
    }
}
