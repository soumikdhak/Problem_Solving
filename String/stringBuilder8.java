//9. Transform a string into its ASCII sum

import java.util.Scanner;

public class stringBuilder8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int sum=0;

        for(int i=0;i<sb.length();i++){
            //char ch = s.charAt(i);
            int ascii=(int) sb.charAt(i);
            System.out.println(sb.charAt(i)+" = "+ascii);

            sum+=ascii;
        }

        System.out.println("Transformed into ascii Number : "+sum);
        sc.close();
    }
}
