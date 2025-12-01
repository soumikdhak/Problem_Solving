//10. Toggle case using StringBuilder

import java.util.Scanner;

public class stringBuilder9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<sb.length();i++){
            // char ch=sb.charAt(i);
            if(Character.isUpperCase(sb.charAt(i))){
                char ch = Character.toLowerCase(sb.charAt(i));
                sb.setCharAt(i, ch);
            }else{
                char ch = Character.toUpperCase(sb.charAt(i));
                sb.setCharAt(i, ch);
            }
        }
        System.out.println("After togglling the string : "+sb);
        sc.close();
    }
}
