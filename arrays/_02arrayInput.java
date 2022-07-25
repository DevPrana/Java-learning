package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _02arrayInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] id=new int[5];

        //Input using for loop

        for(int i=0;i<id.length;i++){
            id[i]=input.nextInt(); //Integer input
        }
        input.nextLine(); //clears the buffer \n
        
        for(int i=0;i<id.length;i++){
            System.out.println(id[i]); //id array output
        }

        /*
        In java we also have something called the enhanced for loop
        in this for loop we put the datatype followed by our variable which will reference elements inside array and then the array name
        It is similar to for elem in arr(): in Python where element is representing all the leemnts inside the for loop
        It is also called for each loop
         */
        for (int element : id) {
            System.out.println(element); //id array output
        }
        
        System.out.println(Arrays.toString(id)); //Used to print the array in a prettier manner ctrl click to see string builder code
        input.close();
    }
}
