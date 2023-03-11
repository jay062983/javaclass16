package javaclass16;

public class Students {
    /* Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

    String name;
    String ID;
   static int numberofStudents;
    int count;


    public static void main(String[] args) {
        Students info=new Students();
        info.ID="qas1233";
        info.name="Dave";
        info.numberofStudents++;

        Students info1=new Students();
        info1.ID="qas1233";
        info1.name="Dave";
        info1.numberofStudents++;
        Students info2=new Students();
        info2.ID="qas1233";
        info2.name="Dave";
        info2.numberofStudents++;

        System.out.println(Students.numberofStudents);




    }

}
