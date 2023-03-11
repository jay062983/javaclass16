package javaclass16;

public class syntaxEmployee {
    /*  create a class called syngtaxEmployee:
    * create theree variables empID, salary and set the CEO to "Alan"
    * create two objects of the class syntaxEmployee
    * set the value of eID, salary for each of the objects
    * print out the eID, salary adn CEO for each of the objects*/

    String empID;
    double salary;
   static String CEO;


    public static void main(String[] args) {
        syntaxEmployee sys=new syntaxEmployee();
        sys.CEO="Alan";
        sys.salary=20111;

        syntaxEmployee sys1=new syntaxEmployee();
        sys1.CEO="Alan";
        sys1.salary=20111;
        System.out.println(sys1.CEO);
    }

}
