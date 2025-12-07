//8. Print all elements of array

package recursion;

public class recursion7 {
    public static void printArray(int[] arr, int n) {
        if(n==arr.length) return;

        System.out.println(arr[n]);

        printArray(arr, n+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,4,5};

        int n = 0;

        printArray(arr, n);
    }
}
