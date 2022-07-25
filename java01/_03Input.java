package java01;

import java.util.Scanner;

public class _03Input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter roll.no.: ");
            int rollno=input.nextInt();
            input.nextLine();           //To delete the \n left in the buffer as other next methods dont clear and cursor does not go infront of it
            System.out.println("The roll number you entered is: " +rollno+"\n");

            System.out.print("Enter your age: ");       
            /*
            This is an alternative method to take integer input as we now take the entire line input
            and then we convert it into an integer later (as we take input using nextline the \n is cleared)
            */
            int age=Integer.parseInt(input.nextLine());
            System.out.println("The age you enetered is: "+age+"\n");

            System.out.print("Please enter your percentage: ");
            float percentage=input.nextFloat();
            input.nextLine();
            System.out.println("Your Percentage is: "+percentage+"\n");

            String name= input.next();    //Takes only first word in a line till \s is encountered
            input.nextLine();               //Clears the remaing buffer including \n so cursor places at the end 
            System.out.println("My name is: "+name+"\n");

            String line=input.nextLine();
            System.out.println("The line you entered is: "+line);

        }      
        /*
        As a general rule of thumb it is required to close all IO classes if we open them in our case as we have opened the Scanner class
        We are required to close it which can be done using "input.close()" 
        
        However the close method is undesirable as it will make it so that we cannot take any more inputs using our scanner class constructor
        it will give us "java.util.NoSuchElementException: No line" found error

        A better method is using the try closes like try-finally try-with etc
        
        In the above case we have used the try with clause with clause is inside try brackets
         */

         //TODO add in README
    }
    
}
