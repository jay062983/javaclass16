package javaclass16;

import Accessmodifiers.Person;

import java.util.Scanner;

public class Persontester {

    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankbalance);
        //System.out.println(person.address);
        System.out.println(person.name);
        person.printsocialmediaAccount();
        Scanner scan=new Scanner(System.in);
        String str="afk";
    }
}
