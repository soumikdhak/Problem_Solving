// 12. Check if a number is even or odd.

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temparature in celcius : ");
        int value=sc.nextInt();

        if(value%2==0){
            System.out.println("This is a even number");
        }else{
            System.out.println("This is a odd number");
        }

        sc.close();
    }
}
