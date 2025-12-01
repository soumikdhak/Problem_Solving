//9. Print Elements at Even and Odd Indexes

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
        
        for(int i=0; i<arr.length; i++){
            if (i%2 == 0) {
                System.out.println("Element at even index " + i + ": " + arr[i]);
                
            }else {
                System.out.println("Element at odd index " + i + ": " + arr[i]);
            }
        }
        sc.close();
    }
}
