//Find All Pairs with Given Sum

//Input: {1, 5, 7, -1, 5}, sum = 6

//Output: (1,5), (7,-1), (1,5)


import java.util.Scanner;

public class array7 {
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
        
        System.out.println("paired which gives the sum 6 : " );
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])==6){
                    System.out.println("( "+arr[i]+" , "+arr[j]+" ) ");
                }
            }
        }
        
        sc.close();
    }
}
