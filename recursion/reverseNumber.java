package recursion;
import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int loop=in.nextInt();
        System.out.println(reverser(loop)); 
        in.close();
    }

    static int reverser(int n){
        if(n==0){
            return 0;
        }
        return (int)(n%10 * Math.pow(10,(int)Math.log10(n)))+reverser(n/10);
    }
}
