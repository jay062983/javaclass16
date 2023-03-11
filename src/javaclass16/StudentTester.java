package javaclass16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="John";
        student.id="123";
        student.age=23;
        student.weight=220;
       student.schoolname="abcd";

        Student student1=new Student();
        student1.name="chad";
        student1.id="123";
        student1.age=43;
        student1.weight=180;
        student1.schoolname="abcd";

        Student student2=new Student();
        student2.name="david";
        student2.id="123";
        student2.age=33;
        student2.weight=320;
       //student2.schoolname="abcd";
        System.out.println(student2.schoolname);
    }
}
