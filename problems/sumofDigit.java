import java.util.Scanner;

public class sumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        String value = sc.next();

        int sum = 0;

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);     // get each character
            int digit = ch - '0';          // convert char to integer
            sum += digit;                  // add to sum
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
