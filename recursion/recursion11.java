//12. Remove all occurrences of a character

package recursion;

import java.util.Scanner;

public class recursion11 {

    public static void removeChar(String s, int n, String newS, char ch) {
        if(n==s.length()){
            System.out.println("Here is your '"+ch+"' free String : "+newS);
            return;
        }

        if(s.charAt(n)!=ch){
            newS+=s.charAt(n);
        }
        

        removeChar(s, n+1, newS, ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your word or String : ");
        String s = sc.nextLine();
        System.out.print("Enter the character you want to remove : ");
        char ch = sc.next().charAt(0);


        String newS = "";

        int n = 0;

        removeChar(s, n, newS, ch);
        sc.close();
    }
}
