package recursion;

import java.util.Scanner;

public class printing1toN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int loop=in.nextInt();
        Nto1(loop);
        print1toN(loop);
        in.close();
    }

    static void Nto1(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            Nto1(n-1);;
        }
    }

    static void print1toN(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            print1toN(n-1);
            System.out.println(n);
        }
    }
}
