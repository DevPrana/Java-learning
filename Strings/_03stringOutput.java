package Strings;

import java.util.Arrays;

public class _03stringOutput {
    public static void main(String[] args) {
        /*
        When we use the println from System.out this println function is present in the class Prinstream and we dont use generics for println
        instead java uses function overloading by giving different arguments in the println function
         */

        //For integer printstream output
        System.out.println(54);
        /*
        When we try to print an integer it first calls the println function int he printstream class which takes integer arguments
        This function then calls the value of function in the string class which converts the integer to a string using Integer.toString(int i) method
        */

        //For obejct Prinstream output
        System.out.println(new int[]{1,2,3,4});
        //We can see the console output is a random string which is because like before println is called for object specific datatypes
        // this calls the value of function which returns null if the object is null or returns the tostring function
        // This to string function then returns getClass().getName() + "@" + Integer.toHexString(hashCode());
        // We can see the compiler calling the obj.tostring which tries converting te objects hashcode to a hexadecimal string
        //This is what we see in our output followed by the @ sign

        //We can use prettyprinting of arrrays using the array inbuilt function
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
        /*
        This calls the to string function of the Arrays class which prints our object in a structured manner
        We can read the pretty print code emploting for logic to do such formatting
         */
    }
}
