//7. Check if array is sorted

package recursion;

public class recursion6 {

    public static boolean sortedArray(int[] arr, int n) {

        if((arr.length-1)==n) return true;

        if(arr[n]>arr[n+1]) {
            return false;
        }

        return sortedArray(arr, n+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,4,6,8};

        int n = 0;

        boolean issorted = sortedArray(arr, n);

        if(issorted){
            System.out.println("This is a Sorted Array");
        }else{
            System.out.println("This is not a sorted Array");
        }
    }
}
