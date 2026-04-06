import java.util.Scanner;
public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER THE SIDES OF THE TRIANGLE:\n");
        double a,b,c;
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        if(a+b>c && b+c>a && a+c>b)
            System.out.println("THE SIDES CAN FORM A TRIANGLE");
        else
            System.out.println("THE SIDES CANNOT FORM A TRIANGLE");



        
    }
    
}
