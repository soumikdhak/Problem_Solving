 //10. Find the second largest number in an array.

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size;i++){
            System.out.print("Element ["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        int secondLargest = 0;
        for(int i=0; i<arr.length;i++){
            if(max>arr[i] && secondLargest<arr[i]){
                secondLargest=arr[i];
            }
        }

        System.out.println("Second Largest element in the Array : "+secondLargest);

        sc.close();
    }
}
