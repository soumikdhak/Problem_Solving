//Reverse the elements without using another array.

import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size: ");
       int size = sc.nextInt();

       int array[] = new int [size];

       //input
       for(int i=0; i<size; i++){
           System.out.print("Array["+i+"] : ");
            array[i]=sc.nextInt();
       }

       for (int i=0; i<size/2; i++){
           int temp = array[i];
           array[i] = array[size-1-i];
           array[size-1-i]=temp;
       }
       System.out.print("Reversed Array : ");
        for (int j = 0; j<array.length; j++){
           System.out.print(array[j]+" ");
        }

        sc.close();
   }
}
