//3. Delete all digits from a string

import java.util.Scanner;

public class stringBuilder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String newWord = sc.nextLine();
        StringBuilder sb = new StringBuilder(newWord);

        for(int i=0; i<sb.length();i++){
            if(Character.isDigit(sb.charAt(i))){
                sb.delete(i, i+1);
                i--;
            }
        }

        System.out.println("Extracted characters from the Stirng : "+sb);
        sc.close();
    }
}
