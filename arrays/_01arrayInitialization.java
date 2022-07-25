package arrays;

public class _01arrayInitialization {
    public static void main(String[] args) {

        int[] rnos={24,25,26,24,78}; //This is one way to create an arraywhere we are already famiiar with the data elements
        rnos[0]=98;
        int[] age;          //Decalaration of our array. The array is assinged memory in the stack
        age=new int[10];    //Initialization of array, the actaul object is created here and is stored in heap memory
        String[] names=new String[5];

        System.out.println(age[0]); //All initial elements are 0
        System.out.println(names[0]);   //All initial values are null
        /*
        First int[] specifies the datatype 
        age is our reference variable (used to refer the array)
        new int[10] creates object in heap so in our rnos array the values 24,25,26,24,78 will be in Heap

        The keyword new is used to create an object and allocates memory to heap when called to create objects
         */


    }
}
