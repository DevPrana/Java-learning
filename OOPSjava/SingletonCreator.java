package OOPSjava;

public class SingletonCreator {
    public static void main(String[] args){
        Singleton obj=Singleton.getInstance();

        Singleton obj1=Singleton.getInstance();

        // Singleton obj2=Singleton.getInstance();
        // When we create object 1 and 2 no new objects are actually created since the else condtion returns the already initialized static instance
        
        obj.setData(45);
        System.out.println(obj1.getData());
    
    }
    
}
