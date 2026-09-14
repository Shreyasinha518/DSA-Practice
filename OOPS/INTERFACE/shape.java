import java.util.*;
interface shapes {
    double computeArea();
}
class Circle implements shapes{
    double r;
    Circle(double r){
        this.r=r;
    }
    @Override 
   public  double computeArea(){
        return Math.PI*r*r;
    }


}
class Rectangle implements shapes{
    double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    @Override 
   public  double computeArea(){
        return l*b;
    }


}
public class shape{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int type;
        System.out.println("1.Circle\n2.Rectangle\n");
        loopTypes:
        while(true){
            type=sc.nextInt();
            switch (type) {
                case 1:
                    Circle c=new Circle(sc.nextDouble());
                    System.out.printf("Circle: %.2f",c.computeArea());
                    break;
                case 2:
                    Rectangle r=new Rectangle(sc.nextDouble(),sc.nextDouble());
                    System.out.printf("Rectangle: %.2f",r.computeArea());
                    break;
                case 0:
                    break loopTypes;
                default:
                    System.out.println("invalid input");
                
                
            }
        }
    }

}

