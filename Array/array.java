//8. Count Frequency of an Element

import java.util.Scanner;

public class array {
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
        int count = 0;
        System.out.print("Enter the value to be searched:");
        int value = sc.nextInt();
        for(int i=0; i<size; i++){

            if(arr[i]==value){
                count++;
            }    
        }
        sc.close();
        System.out.println("The frequency of " + value + " is: " + count);
    }
}
