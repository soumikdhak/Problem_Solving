//Q3. Print the sum of first n natural numbers.

package recursion;

import java.util.Scanner;

public class recursion1 {
    //static int sum =0;
    public static void printSum(int n,int sum){

        if(n==0) {
            System.out.println("Sum of n natural numbers "+sum);
            return;
        }
        sum+=n;

        printSum(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        printSum(n,sum);
        sc.close();
    }
}
