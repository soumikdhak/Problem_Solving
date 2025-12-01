/*
1. take a array of numbers
2. run the outer loop i<array.length times
3. run the inner loop array.length-1-i times
4. compare the j th element to the j+1 th element
5. if jth element is greater then swap it
6. swap until it sort 
*/

package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static int[] printArray(int[] arr){
    return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int[] sorted=printArray(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
