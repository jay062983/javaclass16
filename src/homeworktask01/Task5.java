package homeworktask01;

public class Task5 {
    /* Write a method to return whether given number is prime or not*/

    void isprimenumber(int n){
         n=7;
        boolean flag=true;
        if(n>1){
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    flag=true;
                    break;
                }
            }

        }else{
            flag=false;
        }

    }

    }
