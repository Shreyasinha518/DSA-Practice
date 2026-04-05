import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double r;
        System.out.println("ENTER THE RADIUS OF THE CIRCLE");
        r=in.nextDouble();
        double Area=Math.PI*r*r;
        System.out.println("AREA OF CIRCLE:"+Area);


        
    }
    
}
