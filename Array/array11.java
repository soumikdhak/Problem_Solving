//4. Find the Minimum Element
//3. Find the Maximum Element
//2. Sum of All Elements

import java.util.Scanner;

public class array11 {
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

       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       int sum = 0;

       //output : print the array elements and sum of array elements
       System.out.print("Array : ");
       for(int j=0; j<array.length; j++){
           System.out.print(array[j]+" ");
           sum+=array[j];
           if (max < array[j]){
               max = array[j];
           }
       }
       System.out.println();

       // for min elements
       for (int i = 0; i<array.length; i++){
           if(min > array [i]){
               min = array[i];
           }
       }

       //find the sum
       System.out.println("Total sum of the array Elements : "+sum);
       // max elements in the array
       System.out.println("Maximum Elements in the array : "+max);
       //min elements in the array
       System.out.println("Minimum Elements in the array : "+min);


       sc.close();
    }
}
