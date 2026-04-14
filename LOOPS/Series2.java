import java.util.Scanner;
public class Series2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms :");
        n=in.nextInt();
        int a=4;int d=6;
        for (int i=4;i<=n;i++){
            System.out.print(a+" ");
            a+=d;

        }


    }
    
}
