      // 3. Write code to print Fibonacci series.

import java.util.Scanner;

public class fibonacci {

    public static void fibbonacciSeries(int number){
        int arr[]=new int[number];
       
        for(int i=0;i<number;i++){
            if(i>1){
                int num=arr[i-1]+arr[i-2];
                arr[i]=num;
            }else{
                arr[i]=i;
            }  
        }
        
        for(int i=0; i<number;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int value=sc.nextInt();

        fibbonacciSeries(value);

        sc.close();
    }
}
