import java.util.Scanner;

public class stringBuilder6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();

        System.out.print("Enter Rotation Count : ");
        int rotation = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder(s);

        rotation = rotation % sb.length(); // prevents overflow

        for(int i = 0; i < rotation; i++){
            char lastChar = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, lastChar);
        }

        System.out.println("After " + rotation + " Right Rotations : " + sb);
    }
}
