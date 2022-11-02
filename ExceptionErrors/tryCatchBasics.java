package ExceptionErrors;

import java.util.Scanner;

public class tryCatchBasics {
    public static int quotient(int a,int b){
        if(b==0){
            // When we use the trhow block the user is meant to catch the exceprtion we can aternativelt use the 
            throw new ArithmeticException("The divisor cannot be 0");
            // The exception is an object created form the exception class in this case the exception is Arithmetic class. We invoke the Arithmetoc class constructor by passing hte string argument
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter to integers: ");
        int num1=in.nextInt();
        in.nextLine();
        int num2=in.nextInt();
        try{
            int result=quotient(num1, num2);
            System.out.println("Ans is "+result);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        System.out.println("execution continues");
    }

    
}

