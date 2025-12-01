//Find Second Largest Element

import java.util.Scanner;

public class array4 {
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
        
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondMax=0;
        for(int j=0; j<arr.length; j++){
            if(max>arr[j] && arr[j]>secondMax){
                secondMax=arr[j];
            }
        }
        System.out.println("Second Maximum value"+secondMax);
        sc.close();
    
    }
}
