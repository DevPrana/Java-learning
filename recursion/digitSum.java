package recursion;

import java.util.*;

public class digitSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int loop=in.nextInt();
        System.out.println(sumDigit(loop)); 
        in.close();
    }

    static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumDigit(n/10);
    }
}
