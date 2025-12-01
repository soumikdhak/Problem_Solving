//Rotate an Array by k Positions

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int rotated[]=new int[size];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<size; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Rotation Position : ");
        int k=sc.nextInt();
        k=k%size;

        for(int i=0;i<arr.length;i++){
            //right rotation
            //rotated[(i+k)%size]=arr[i];

            //left rotation
            rotated[i]=arr[(i+k)%size];
        }

        System.out.println("\nRotated Array by k positions :");
        for(int i=0; i<arr.length;i++){
            System.out.print(rotated[i]+" ");
        }
        sc.close();
    }
}
