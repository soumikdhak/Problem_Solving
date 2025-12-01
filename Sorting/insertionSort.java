/*
1.take an array
2.run the inner loop from i=1 to array.length for the unsorted part
3.assign the key with the i=1 th index 
4.initialize j=i-1 for accessing the previous element
5.run the while loop for shorted part and comparing the previous element with the key
6.set the key element at its position 
7.looping it until the all elemnt are sorted 
 */

package Sorting;

import java.util.Arrays;

public class insertionSort {

    public static int[] printarray(int[] args){
        return args;
    }
    public static void main(String[] args) {
        int[] array = {7,8,3,1,2};

        for(int i=1; i<array.length; i++){
            int key = array[i];
            int j=i-1;

            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                j--;
            }

            array[j+1]=key;
        }

        int[] sorted=printarray(array);
        System.out.println(Arrays.toString(sorted));
    }
}
