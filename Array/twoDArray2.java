//3. Sum of Each Row and Column

import java.util.Scanner;

public class twoDArray2 {
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

        int rowSum[] = new int[row];
        int columSum[] = new int[column];
        
        // Calculate row and column sums
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rowSum[i] += arr[i][j];     // row sum
                columSum[j] += arr[i][j];   // column sum
            }
        }

        System.out.println("\nSum of each row:");
        for (int i = 0; i < row; i++) {
            System.out.println("Row " + i + " = " + rowSum[i]);
        }

        System.out.println("\nSum of each column:");
        for (int i = 0; i < column; i++) {
            System.out.println("Column " + i + " = " + columSum[i]);
        }

        sc.close();
    }
}
