package com.coder.inheritance;

class School {

    void schoolDetails() {
        System.out.println("This is a school");
    }
}

class Teacher extends School {

    void teacherDetails() {
        System.out.println("This is a teacher");
    }
}

class SubjectTeacher extends Teacher {

    void subjectDetails() {
        System.out.println("Teacher teaches Java");
    }
}

public class multilevelInheritance {

    public static void main(String[] args) {

        SubjectTeacher s = new SubjectTeacher();

        s.schoolDetails();
        s.teacherDetails();
        s.subjectDetails();
    }
}