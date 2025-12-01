import java.util.Scanner;

public class stringBuilder7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();
        sc.close();

        s = s.trim(); // remove leading/trailing spaces
        String[] words = s.split(" +"); // split by one or more spaces
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            if(i != 0) sb.append(" "); // add space between words
        }

        System.out.println("New string by removing spaces + reversing words: " + sb);
    }
}
