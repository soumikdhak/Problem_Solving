//Q4. Print factorial of a number n.

package recursion;

import java.util.Scanner;

public class recursion2 {

    public static void factorial(int n, int multiply){
        if(n==0) {
            System.out.println("Factorial of n number is : "+multiply);
            return;
        }

        multiply*=n;
        factorial(n-1, multiply);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int multiply = 1;

        factorial(n,multiply);
        sc.close();
    }
}
