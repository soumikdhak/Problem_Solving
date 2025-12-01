import java.util.Scanner;

public class primeNumber {

    public static void checkPrimeNumbers(int value) {
        int count = 0;

        for (int i = 2; i < value; i++) {  // only till value-1
            if (value % i == 0) {
                count++;
            }
        }

        if (count == 0 && value > 1) {
            System.out.println("This is a Prime Number");
        } else {
            System.out.println("This is NOT a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int value = sc.nextInt();

        checkPrimeNumbers(value);

        sc.close();
    }
}
