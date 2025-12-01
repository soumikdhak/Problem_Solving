// 11. Write a program to convert Celsius to Fahrenheit.

import java.util.Scanner;

public class temparatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temparature in celcius : ");
        int value=sc.nextInt();

        double fahrenheit = (value*1.8)+32;

        System.out.println("Here is your temparature in Fahrenheit : "+fahrenheit);

        sc.close();
    }
}
