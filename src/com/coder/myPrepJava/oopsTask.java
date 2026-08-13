package com.coder.myPrepJava;

//abstraction
abstract class Person {

    private String name;
    private int age;
    //Encapsulation
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void displayRole();

    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

interface Activity {

    void activity();

}
//inheritance
class Student extends Person implements Activity {

    private int studentId;
    private double marks;
//polymorphism  
    Student(String name, int age, int studentId, double marks) {
        super(name, age);
        this.studentId = studentId;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getMarks() {
        return marks;
    }

    void displayRole() {
        System.out.println("Role : Student");
    }

    public void activity() {
        System.out.println("Activity : Learning Java");
    }

    void displayDetails(String course) {
        super.displayDetails();
        System.out.println("Student ID : " + studentId);
        System.out.println("Marks      : " + marks);
        System.out.println("Course     : " + course);
    }
}

class Teacher extends Person {

    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role : Teacher");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject : " + subject);
    }
}

public class oopsTask {

    public static void main(String[] args) {

        Student student = new Student(
                "Ganesh",
                22,
                101,
                85.5
        );

        Teacher teacher = new Teacher(
                "Ravi",
                35,
                "Java"
        );

        System.out.println("----- Student Details -----");

        student.displayDetails();
        student.displayRole();
        student.activity();

        System.out.println();

        student.displayDetails("Java Full Stack");

        System.out.println();

        System.out.println("----- Teacher Details -----");

        teacher.displayDetails();
        teacher.displayRole();

        System.out.println();

        Person person1 = student;
        Person person2 = teacher;

        System.out.println("----- Runtime Polymorphism -----");

        person1.displayRole();
        person2.displayRole();
    }
}