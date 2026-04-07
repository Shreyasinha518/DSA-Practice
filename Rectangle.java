import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int l,b;
        System.out.println("ENTER THE LENGTH:");
        l=in.nextInt();
        System.out.println("ENTER THE BREATH:");
        b=in.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("AREA OF RECTANGLE: "+area);
        System.out.println("PERIMETER OF RECTANGLE:"+perimeter);
        if(area>perimeter){
            System.out.println("AREA OF RECTANGLE IS GREATER THAN THE PERIMETER");
        
        }
    
    }
    
}
