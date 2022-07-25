package java01;

import java.util.Scanner;

public class _04TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num=(int)(67.56f);
        System.out.println(num);
        input.close();
        /*
        Type casting refers to when we compress a larger datatype in hierarchy to a lower datatype in hierarchy
        For example if we try assigning a float to an integer datatype java will throw us an error but using typecasting we can prevent this error
        
        Type casting is when you assign a value of one primitive data type to another type.
        Casting can be of two types when we convert a smaller type to a larger type "Widening/Implicit casting"
        or when we convert a larger type to a smaller type "Narrowing/Explicit casting"
        
        The smaller to larger datatype order is as follows
        byte -> short -> char -> int -> long -> float -> double

        We have to manually typecast the larger datatype to smaller but java converts the smaller to larger automatcially
        Narrowing casting must be done manually by placing the type in parentheses in front of the value:
         */

        //Automatic type promotion
        byte a=10;
        byte b=20;
        int mul=a*b;
        System.out.println(mul);
        /*
        In the above case we can see that mul has been declared as an integer even when we are performing byte operations on the 
        Right Hand Side it is because JAVA while performing these calculations converts a and b into integers automatically 
        so there is no limitations as we would see in a byte (ex 256 integer limit)
         */

        byte aa=10;
        byte bb=20;
        //byte sum=aa+bb;
        //This will give an error since the operations result in an integer so we would have to perform narrowing conversion
    }
}
