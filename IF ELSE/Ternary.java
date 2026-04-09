import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
    int num=in.nextInt();
    System.out.println((num%2==0)?"EVEN":"ODD");
    }
}
