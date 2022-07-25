package Strings;

import java.util.Scanner;

public class _01stringParse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char let=input.next().charAt(0);

        System.out.println(search(str,let));
        
        /*
        We can also use a enhanced for loop to parse over every character in a character arary
        made from our string with the method toCharArray and returning tru of our target matches the character in array
         */
        
        input.close();
    }

    static boolean search(String str,char let){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(let==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
