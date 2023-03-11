package homeworktask01;

public class Task4 {
   /* 4)Create a method that will say Hello in different language based on the country that will passed when method is executed
    */

String  sayhello(String countryname){
    switch (countryname){
        case "USA":
            return"Hello";
        case"Itly":
            return"ciao";
        case "China":
            return"ni hao";
        default:
            return "country not supported";

    }
}

    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayhello("China"));
    }
}
