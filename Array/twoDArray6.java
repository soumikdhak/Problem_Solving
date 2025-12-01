//7. Search for an Element in Matrix

import java.util.Scanner;

public class twoDArray6 {
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
        
        System.out.print("Serached Element : ");
        int searchedElement=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]==searchedElement){
                    //diagonalSum+=arr[i][j];
                    System.out.println("At index : "+i+","+j+" = "+arr[i][j]);
                }
            }
        }
        sc.close();
    }
}
