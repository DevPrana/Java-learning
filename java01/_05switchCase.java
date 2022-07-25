package java01;

import java.util.Scanner;

public class _05switchCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        switch (name){
            case "Adarsh","Surabhi":    //Supports multiple cases for one command block
            System.out.println("Parents: ");
            break;

            case "Surabi":{ //Supports {} to declare a local scope
            int age=46;
            System.out.println(age);

            System.out.println("Mother: ");
            break;}

            case "prerit":
            System.out.println("Mind the case! ");
            System.out.println("Testing enhaved switch");
            break;

            //case "Prakash"-> System.out.println("Grandmother"); another way to declare cases although using : and -> within same switch isnt allowed

            case "Prerit":
            System.out.println("Self discovered");
            break;

            default:
            System.out.println("Person not recognized");
        }
        //System.out.println(age); This statement will not work as we have declared the age variable within the scope of our case using {}
        // The {} brackets form their own local scope and variables initialized inside will remain accesible inside only
        input.close();
    }
}