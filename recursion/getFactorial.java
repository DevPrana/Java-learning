package recursion;

import java.util.Scanner;

public class getFactorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int loop=in.nextInt();
        System.out.println(factorial(loop)); 
        in.close();
    }

    static int factorial(int n){
        int fact;
        if(n==2){
            return 2;
        }
        fact=n*factorial(n-1);
        return fact;
    }
    
}
