//Check if Array is Sorted and Rotated

import java.util.Scanner;

public class array8 {
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
        
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(!(arr[i]<arr[i+1])){
                count++;
            }
        }

        if(count==1){
            System.out.println("Array is soretd and Rotated");
        }else{
            System.out.println("Both requirement is not matched");
        }
        sc.close();
    }
}
