// 2. Write a function to reverse a string.

import java.util.Scanner;

public class reverseString {

    public static void reverseAString(String value){
        String newString = "";
        for(int i=value.length();i>0;i-- ){
            char ch=value.charAt(i-1);
            newString+=ch;
        }
        System.out.println("Here is the reverse value of the String : "+newString);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String value=sc.nextLine();

        reverseAString(value);

        sc.close();
    }
    
}