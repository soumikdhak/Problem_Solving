import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicate Elements : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;   // prevents printing same duplicate multiple times
                }
            }
        }

        sc.close();
    }
}
