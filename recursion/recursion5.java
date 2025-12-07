//1. Print numbers from N to 1

package recursion;

import java.util.Scanner;

public class recursion5 {

    public static void printSquare(int n){
        if(n==0) return;

        System.out.println("Value of N : "+n);

        printSquare(n-1);
    }    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N : ");
    int n = sc.nextInt();
    printSquare( n );
    sc.close();
    }
}
