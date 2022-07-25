package java01;

public class _08shadowing {
    //When we declare a static variable that variable/method is common for the entire class and all objects within that class Ref.README
    static int x=100;
    /*
    Shadowing refers to a practice when we declare a class object/static (object/variable) and then declare it inside a scope block
    Ex. in our case we will shadow the static integer x inside the main class shadow means to overlap the old value with the new one    
    */
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x); will throw an error as shaoding only happens after initialization of the new variable
        x=50;
        System.out.println(x);
        hello(); //As this function actually is outside the scope block main {} so the redeclaration of x=50 will not affect its orignal value
    }

    static void hello(){
        System.out.println(x);
    }

    /*Must remeber shadowing only happens for class variables not mehtods or their variables */
}
