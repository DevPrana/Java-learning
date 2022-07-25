package java01;

public class _09functionOverloading {
    public static void main(String[] args) {
        hello(56);
        hello("Prerit");
        hello(54756.896f,325.7564f);
    }
    
    static void hello(int a){
        System.out.println(a);
    }

    static void hello(String b){
        System.out.println(b);
    }

    static void hello(Float num,Float num1){
        System.out.println(num+num1);
    }
    /*
    This is an example of function overloading where we are creating same function names with different arguments passed each time 
    The areguments that we provide intially when we call the funtion are amtched with the function which takes in that arguments
    and then executes the function body.

    Overloading allows different methods to have the same name (hello in our case), but different signatures where the signature can differ by the 
    number of input parameters or type of input parameters or both. Overloading is related to compile-time (or static) polymorphism
     */   
}
