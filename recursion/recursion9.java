//10. Reverse a string

package recursion;

public class recursion9 {

    public static void reverseString(String s, String newS, int i) {
        if(i==s.length()){
            System.out.println("Reverse String : "+newS);
            return;
        }

        char ch = s.charAt(s.length()-1-i);

        newS+=ch;

        reverseString(s, newS, i+1);
        
    }
    public static void main(String[] args) {
        String s = "Soumik";

        String newS = "";

        //int n = s.length();

        int i = 0;

        reverseString(s, newS, i);
    }
}
