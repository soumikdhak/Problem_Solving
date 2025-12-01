// 9. Swap two numbers without using a temporary variable.

import java.util.Scanner;

public class swappingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st value : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd value : ");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After reversing The value of first one is : "+a+"\nand the value of second one is : "+b);
        sc.close();
    }
}
