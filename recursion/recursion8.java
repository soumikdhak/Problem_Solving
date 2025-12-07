//9. Find maximum element in array

package recursion;

public class recursion8 {
    public static void findmax(int[] arr, int n, int max) {
        if(n==arr.length-1){
            System.out.println("Maximum element in the array : "+max);
            return;
        }

        if(max<arr[n+1]){
            max=arr[n+1];
        }

        findmax(arr, n+1, max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,9,5};

        int n = 0;

        int max = arr[0];

        findmax(arr, n, max);
    }
}
