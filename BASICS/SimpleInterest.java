import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double p,t,r;
        System.out.println("ENTER PRINCIPLE:");
        p=in.nextInt();
        System.out.println("ENTER TIME:");
        t=in.nextInt();
        System.out.println("ENTER RATE:");
        r=in.nextInt();
        double SI=(p*r*t)/100;
        System.out.println("SIMPLE INTEREST IS: "+SI);

    }
}
