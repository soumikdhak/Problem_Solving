//4. Find the Largest Element in Matrix

import java.util.Scanner;

public class twoDArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        
        int arr[][] = new int[row][column];
        
        System.out.println("\nEnter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element [" + i + "," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int max=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The Largest Element in Matrix is : "+max);
        

        sc.close();
    }
}
