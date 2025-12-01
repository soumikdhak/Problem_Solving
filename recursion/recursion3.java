//Q5. Print the fibonacci sequence till nth term.

package recursion;

import java.util.Scanner;

public class recursion3 {

    public static void fibonacci(int n, int num, int[] arr){

        if(n==0) {
            return;
        }

        arr[num]=num;

        if(num>=2){
            arr[num] = arr[num-2] + arr[num-1];
            System.out.println(arr[num]);
        }else{
            System.out.println(num);
        }

        num++;

        fibonacci(n-1,num,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int num = 0;

        fibonacci(n,num,arr);
        sc.close();
    }
}
