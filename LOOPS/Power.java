import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
    int a,b;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER BASE");
    a=in.nextInt();
    System.out.println("ENTER EXPONENT");
        b=in.nextInt();
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
        }

    
    
    

System.out.println(a+" TO THE POWER "+b + " = " +power);
}

    
}