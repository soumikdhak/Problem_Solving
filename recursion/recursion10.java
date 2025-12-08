//11. Check palindrome string

package recursion;

import java.util.Scanner;

public class recursion10 {

    public static boolean checkPalindrome(int n, String s) {
        if(n==(s.length()/2)){
            return true;
        }

        if(s.charAt(n)!=s.charAt(s.length()-1-n)){
            return false;
        }

        return checkPalindrome(n+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your word or String : ");
        String s = sc.nextLine();

        int n = 0;

        boolean ispalindrome = checkPalindrome(n, s );

        if(ispalindrome){
            System.out.println("the String is Plaindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
        sc.close();
    }
}
