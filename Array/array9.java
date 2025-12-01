//5. Count Even and Odd Numbers
import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size: ");
       int size = sc.nextInt();

       int array[] = new int [size];

       //input
       for(int i=0; i<size; i++){
           System.out.print("Array["+i+"] : ");
            array[i]=sc.nextInt();
       }

       //odd and even
       int odd = 0;
       int even = 0;
       for(int i=0;i<array.length; i++){
           if(array[i]%2==0){
               even++;
           }else {
               odd++;
           }
       }

       System.out.println("Number of Odd Numbers : "+odd);
       System.out.println("Number of Even Numbers : "+even);

       sc.close();
    }
}
