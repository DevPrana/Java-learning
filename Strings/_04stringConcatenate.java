package Strings;

import java.util.Arrays;

public class _04stringConcatenate {
    public static void main(String[] args) {
        /*
        Like how we have the + operator in python java also supports concatenation
        When we add two objects using the + operator it concatenates both these objects into one
        */
        String name="helo";
        int[] arr=new int[]{1,2,3,4,5};
        char hello=' ';
        String add=name+hello+Arrays.toString(arr); //We have to use array.tostring method or we get the hexadecimal hashcode of the array
        System.out.println(add); //Here we can see even though hello is a char(primitive dataype) since we are concatenating it to objects it is also taken as an object and concatenated to the string
        
        /*
        We can however also use the + operator to add numbers and characters
        When the arguments given are only primitive then java doesnt concatenate but instead add the arguments since they are all primitive type
         */
        char a='a';
        char b='b';
        int i=5;
        System.out.println(a+i);
        System.out.println(a+b);
        System.out.println((char)(a+3));
        System.out.println((char)(a+b)); //We use type casting to convert the addendum to a character
    }
}
