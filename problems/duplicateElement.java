// 1. Find duplicate elements in an array.

import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        //int newarr[]=new int[]

        for(int i=0; i<size;i++){
            System.out.print("Element ["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        //for()
        sc.close();
    }
}
