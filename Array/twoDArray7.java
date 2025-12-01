//8. Find Transpose of Matrix (Swap Rows and Columns)

import java.util.Scanner;

public class twoDArray7 {
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
        
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int transposeArray[][]=new int [column][row];
        System.out.println("Transpose Of Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeArray[j][i]=arr[i][j];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
