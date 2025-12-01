//6. Remove all occurrences of a character

import java.util.Scanner;

public class stringBuilder5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        //int count = 1;

        for(int i=0;i<sb.length();i++){

            if(i==sb.length()-1) break;
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i, i+2);
            }
        }
        System.out.println("After Removing all occurrences of a character : "+sb);
        sc.close();
   }
}