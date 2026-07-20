import java.util.Scanner;
public class BUILTIN {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        System.out.println("Enter three numbers to be compared:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(100));
        System.out.println(Math.floor(100));
        System.out.println(Math.ceil(3.009));
        double d=Math.max(a,Math.max(b,c));
        System.out.println("Maximum is:"+d);
        System.out.println(Math.pow(100,2));
        
    }
    
}
