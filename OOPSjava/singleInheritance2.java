package OOPSjava;

import java.util.*;
class geometricShapes{
    private String color;
    private boolean filled;

    public geometricShapes(){
        this("white",false);
    }

    public geometricShapes(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public boolean getFilled(){
        return this.filled;
    }
}

class Circle extends geometricShapes{
    private float radius;

    Circle(String color,boolean filled,int radius){
        super(color,filled);
        this.radius=radius;
    }

    Circle(int radius){
        super();
        this.radius=radius;
    }

    Circle(){
        this("white",false,5);
    }

    public float getRadius(){
        return this.radius;
    }

    public void getShape(){ 
        System.out.println("The radius of the circle is: "+this.getRadius()+"\nThe color of the circle is: "+super.getColor()+"\nThe circle filled property is set to: "+super.getFilled());
    }

    public long getDate(){
        Date date=new Date();
        return date.getTime();
    }
}

public class singleInheritance2 {
    public static void main(String[] args) {
        Circle cir1=new Circle(5);
        cir1.getShape();
        Circle cir2=new Circle("blue",true,10); 
        cir2.getShape();
        
        System.out.println(cir2.getDate()); 
    }
      
}
