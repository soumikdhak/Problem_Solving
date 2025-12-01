// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”


import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String result = sc.nextLine();
        String newresult =  "";

        for(int i=0; i<result.length();i++){
            char word = result.charAt(i);
            if(word=='e'){
                newresult+='i';
            }else{
                newresult+=word;
            }
        }

         System.out.println("Here is the new String : "+newresult);

        sc.close();
    }
}
