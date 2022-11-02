package OOPSjava;


class childSingle extends singleInheritance{
    int a;
    int b;
    public childSingle(){
        super(45,55);
        this.a=25;
        this.b=35;
    }

    public childSingle(int a,int b,int c,int d){
        super(c,d);
        this.a=a;
        this.b=b;
    }
}

public class singleInheritance {
    private int c;
    int d;
    singleInheritance(){
        this.c=10;
        this.d=20;
    }

    singleInheritance(int a,int b){
        this.c=a;
        this.d=b;
    }
    public static void main(String[] args) {
        childSingle obj=new childSingle(10,20,30,40);
        System.out.println(obj.a+obj.b+obj.d);

    }
}
