/*
1.take an array
2.run the outer loop array.length-1 times
3.assign the i th element as the smallest element
4.run the inner loop j=1+i < array.length time
5.if If array[j] < array[smallestElement] element assign smallest element as j
6.After completing outer loop it swap the smallest element with i th ele
7. ruuning the process n time
 */

package Sorting;
import java.util.Arrays;

public class selectionSort {

    public static int[] printarray(int[] args){
        return args;
    }

    public static void main(String[] args) {
        
        int[] array = {7,8,3,1,2};

        for(int i = 0; i<array.length-1;i++){

            int smallestElement=i;

            for(int j=1+i;j<array.length;j++ ){
                if(array[j]<array[smallestElement]){
                    smallestElement=j;
                }
            }
            
            int temp=array[smallestElement];
            array[smallestElement]=array[i];
            array[i]=temp;

        }

        int[] sorted=printarray(array);
        System.out.println(Arrays.toString(sorted));
    }
}

