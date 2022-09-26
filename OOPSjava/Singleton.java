package OOPSjava;

public class Singleton {
    public static void main(String[] args) {
        
    }
    
    private Singleton(){
        System.out.println("hello");
    }
    private int data;

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public int getData(){
        return this.data;
    }

    public void setData(int a){
        data=a;
    }
}
