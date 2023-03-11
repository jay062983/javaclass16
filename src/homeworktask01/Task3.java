package homeworktask01;

public class Task3 {
/* 3) Create a method that will print whether given String is palindrome or not.
     return type => void
      name => ispalindrome
      parameters=>String inputStr
      {
      }
      example dad=>dad true
      abc=>cba false*/

void isPalindrome(String str) {
    StringBuilder st = new StringBuilder(str);
    st.reverse();
    String reversedStr = st.toString();
    if (str.equals(reversedStr)) {
        System.out.println(str + " "+  "is Not a palindrome");
    } else {
        System.out.println(str + " "+  "is Not  a palindrome");
    }
}
    public static void main(String[] args) {
        Task3 task3=new Task3();
        //String result=task3.isPalindrome("fool"); can't assign void methods to variables
        // System.out.println(task3.isPalindrome("fool"); can't use void methods in Println

        task3.isPalindrome("loop");

}

}
