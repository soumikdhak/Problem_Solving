//2. Insert a word at a specific index

import java.util.Scanner;

public class stringBuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String newWord = sc.nextLine();
        StringBuilder sb = new StringBuilder(newWord);

        System.out.println("The original Word is : " + sb);
        
        System.out.print("index Number : ");
        int latterIndex = sc.nextInt();
        sc.nextLine(); 

        System.out.print("The word you want to insert : ");
        String later = sc.nextLine(); // now you can enter spaces

        sb.insert(latterIndex, later);

        System.out.println("The sentence you want to make : " + sb);
        
        sc.close();
    }
}
