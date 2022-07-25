package Strings;

public class _02stringComparisions {
    public static void main(String[] args) {
        /*
        There are two types of comparisions when it comes to strings the first sort of comparison refers to == and the second type of comparision
        is using the strings method equals by taking str1.equal(str2) which also returns a true or false value
        When we use the == operator it does not compare the value of 2 strings but instead compares the reference given by both the strings variables
        Java to avoid memory overflow creates temporary memory pools see memory pools in strings and when we create string 1="something" and string 2=
        "something" then a memory pool with " something" is created and both 1 and 2 refer to that pool hence == check for this same reference.

        When we use equals method then instead of comparing the reference it actually checks for the value
         */

         String name="Prerit";
         String best= "Prerit";

        if(name==best){
            System.out.println("== is verified hence same reference");
        }

        if(name.equals(best)){
            System.out.println("equals method id verified");
        }

        System.out.println("Now checking a new way when we create stings using objects");

        String father=new String("Adarsh");
        String dad=new String("Adarsh");

        //In this case we use key
        if(father==dad){
            System.out.println("== is verified hence same reference");
        }
        else{
            System.out.println("== doesnt work for equals method as diffrent reference");
        }

        if(father.equals(dad)){
            System.out.println("equals method id verified");
        }

    }
    
}
