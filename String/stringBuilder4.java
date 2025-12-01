//5. Compress a string (basic compression)

import java.util.Scanner;

public class stringBuilder4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        int count = 1;

        for(int i=0;i<s.length();i++){

            if(i==s.length()-1){
                sb.append(s.charAt(i));
                if(count>1) sb.append(count);
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                sb.append(s.charAt(i));
                if(count>1) sb.append(count);
                count=1;
            }
        }
        System.out.println("Compressed string : "+sb);

        sc.close();
    }
}
