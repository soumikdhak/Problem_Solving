//7. Copy One Array to Another

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int array[] = new int[size];
        int array1[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            System.out.print("Array[" + i + "] : ");
            array[i] = sc.nextInt();
            array1[i]=array[i];
        }

        //output
        System.out.print("Copied Array : ");
        for(int j=0; j<array.length; j++){
            System.out.print(array1[j]+" ");
        }

       sc.close();
    }
}
