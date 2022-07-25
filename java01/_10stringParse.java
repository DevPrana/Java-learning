package java01;

import java.util.Scanner;

public class _10stringParse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char let=input.next().charAt(0);

        System.out.println(search(str,let));
        
        
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
