// Input an email from the user. You have to create a username from the email by deleting the part that
// comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Email : ");
        String result = sc.nextLine();
        String newresult =  "";
        
        for(int i=0; i<result.length();i++){
            char word = result.charAt(i);
            if(word=='@'){
                break;
            }else{
                newresult+=word;
            }
        }

        System.out.println("Here is the username : "+newresult);

        sc.close();
    }
}
