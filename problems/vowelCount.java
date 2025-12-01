// 8. Count vowels in a string.

import java.util.Scanner;

public class vowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String value=sc.nextLine();
        
        String vowel="aeiou";

        int vowelCount=0;

        for(int i=0;i<vowel.length();i++){
            for(int j=0;j<value.length();j++){
                if(vowel.charAt(i)==value.charAt(j)){
                    vowelCount++;
                }
            }    
        }

        System.out.println("The number of vowel in this String is : "+vowelCount);
        sc.close();
    }
}
