package Questions;

import java.util.Scanner;
public class _01reverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rev_num=0;
        int rem;
        int number=Integer.parseInt(input.nextLine());
        
        while(number>0){
            rem=number%10;
            rev_num*=10;
            rev_num+=rem;
            number/=10;
        }
        System.out.println(rev_num);
        input.close();
    }
    
}
