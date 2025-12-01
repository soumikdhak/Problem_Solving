 //7. Check if a string is palindrome.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String value=sc.nextLine();

        String newString = "";
        for(int i=value.length();i>0;i-- ){
            char ch=value.charAt(i-1);
            newString+=ch;
        }

        //System.out.println("Here is the reverse value of the String : "+newString);

        int size=value.length();
        int check=0;

        for(int i=0;i<size/2;i++){
            if(!(value.charAt(i)==newString.charAt(i))){
                break;
            }else{
                check++;
            }
        }

            if(check==size/2){
                System.out.println("The String is palindrome");
            }else{
                System.out.println("This is not a plaindrome String");
            }
            
        sc.close();
    }
}
