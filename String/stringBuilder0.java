//1. Reverse a string using StringBuilde

import java.util.Scanner;

public class stringBuilder0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String newWord = sc.next();
        StringBuilder sb = new StringBuilder(newWord);

        System.out.println("The original Word is : " + sb);
        
        for(int i=0; i<sb.length()/2; i++){
            int back = sb.length()-1-i;
            int front = i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println("Reversed string : " + sb);
        sc.close();
    }
}
