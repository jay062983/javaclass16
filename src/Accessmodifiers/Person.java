package Accessmodifiers;

public class Person {
    private double bankbalance = 122355;
    String address = "Street 123";
    public String name = "John snow";

    private void printPhonePassword() {
        System.out.println("pass123");
    }

    void printssn() {
        System.out.println("23434q3");

    }
public void printsocialmediaAccount(){
    System.out.println("23423rasd");
}
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankbalance);
        System.out.println(person.address);
        System.out.println(person.name);
        System.out.println();
    }
}
