//10. Find Sum of Positive and Negative Numbers Separately

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            System.out.print("Element " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
        int positive = 0;
        int negetive = 0;
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]>0){
                positive+=arr[i];
            }else{
                negetive+=arr[i];
            }
        }

        System.out.println("The value of positive sum is : "+ positive);
        System.out.println("The value of positive sum is : "+ negetive);
        sc.close();
    }
}
