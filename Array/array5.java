//Move All Zeros to End

import java.util.Scanner;

public class array5 {
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
        
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                //int endEle=size-1;
                arr[j]=arr[i];
                j++;
            }
        }

        for(int i=j; i<size;i++){
            arr[i]=0;
        }
        
        System.out.println("\nArray after moving zeros to the end:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
