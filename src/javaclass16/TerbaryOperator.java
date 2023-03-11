package javaclass16;

public class TerbaryOperator {
    public static void main(String[] args) {


    int num=0;
    if(3>2) {
        num = 10;
    }else{
        num=20;
    }
    num=(3>2)? 10:20;// num=(3>2)?(4>5)?15:25:52;
        // ? can be used instead of if else condition
        System.out.println(num);
}}
