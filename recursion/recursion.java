//Q2. Print numbers from 1 to 5.

package recursion;

public class recursion {

    public static void printNum(int num){
        if(num==6) return;

        System.out.println(num);

        printNum(num+1);
    }
    public static void main(String[] args) {
        int num =1;

        printNum(num);
    }
}
