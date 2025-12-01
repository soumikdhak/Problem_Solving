//10. Multiply Two Matrices

import java.util.Scanner;

public class twoDArray9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        
        int arr1[][] = new int[row][column];
        int arr2[][] = new int[row][column];
        
        System.out.println("\nEnter the elements of the array1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element [" + i + "," + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nEnter the elements of the array2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element [" + i + "," + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nMultiplication of arr1 and arr2 : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr1[i][j]=arr1[i][j]*arr2[i][j];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
