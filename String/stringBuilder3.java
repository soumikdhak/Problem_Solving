//4. Replace all vowels with *

import java.util.Scanner;

public class stringBuilder3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String newWord = sc.nextLine();
        StringBuilder sb = new StringBuilder(newWord);

        String vowel = "aeiou";

        for(int i=0; i<vowel.length();i++){
            for(int j=0; j<sb.length();j++){
                if(vowel.charAt(i)==sb.charAt(j)){
                    sb.setCharAt(j, '*');
                }
            }
        }

        System.out.println("String replaced with * :"+sb);
        sc.close();

    }
}
