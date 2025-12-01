 //6. Sum all elements of an array.

import java.util.Scanner;

public class sumAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size;i++){
            System.out.print("Element ["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Total sum of all elements : "+sum   );

        sc.close();
    }
}
