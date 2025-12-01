//Q6. Print x^n (with stack height = n)

package recursion;

import java.util.Scanner;

public class recursion4 {

    public static void printSquare(int x, int n, int value){
        if(n==0) {
            System.out.println("The Value of X*N is : "+value);
            return;
        }

        value*=x;

        printSquare(x, n-1, value);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int value=1;

        printSquare(x,n,value);
        sc.close();
    }
}
