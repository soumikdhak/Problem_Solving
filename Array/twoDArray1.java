//2. Sum of All Elements in Matrix

import java.util.Scanner;

public class twoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column of the array:");
        int column = sc.nextInt();
        System.out.print("Enter the row of the array:");
        int row = sc.nextInt();
        int arr[][] = new int[column][row];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                System.out.print("Element " +i+","+j + ": ");
            arr[i][j]=sc.nextInt();
            }
        }
        
        int sum =0;
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                sum+=arr[i][j];
            }
        }

        System.out.println("Sum of All Elements in Matrix : "+sum);
        sc.close();
    }
}
