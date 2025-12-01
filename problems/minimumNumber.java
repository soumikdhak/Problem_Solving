// 15. Write a program to find the minimum number in an array.

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size;i++){
            System.out.print("Element ["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("Minimam Element in the Array : "+min);

        sc.close();
    }
}
