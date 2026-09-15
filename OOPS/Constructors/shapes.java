import java.util.*;
class Shape{
    double area;
    void computeArea(){
        System.out.println("compute area");

    }
    void displayArea(){
        System.out.println("display shape");
    }
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
        @Override 
        void computeArea(){
            super.area=Math.PI*r*r;
        }
        @Override 
        void displayArea(){
            System.out.printf("Circle(%.2f):Area=%.2f\n",r,super.area);
        }
    
    }
class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;

    }
    @Override 
    void computeArea(){
        super.area=l*b;
    }
    @Override 
    void displayArea(){
        System.out.printf("Rectangle(%.2f,%.2f):Area=%.2f\n",l,b,super.area);
    }
}
class Triangle extends Shape{
    double h;
    double b;
    Triangle(double h,double b){
        this.h=h;
        this.b=b;

    }
    @Override 
    void computeArea(){
        super.area=0.5*h*b;
    }
    @Override 
    void displayArea(){
        System.out.printf("Triangle(%.2f,%.2f):Area=%.2f\n",h,b,super.area);
    }
}

    

public class shapes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        looptype:
        while(true){
            
            int type=in.nextInt();
            switch(type){
                
                case 1:
                    Circle c= new Circle(in.nextDouble());
                    c.computeArea();
                    c.displayArea();
                    break;

                case 2:
                    Rectangle r= new Rectangle(in.nextDouble(),in.nextDouble());
                    r.computeArea();
                    r.displayArea();
                    break; 

                case 3:
                    Triangle t= new Triangle(in.nextDouble(),in.nextDouble());
                    t.computeArea();
                    t.displayArea();
                    break;
                    
                case 0:
                        break looptype;
                default:
                   System.out.println("Invalid Type");;


            }
            
        }
    }
    
}
