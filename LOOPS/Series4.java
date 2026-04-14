import java.util.Scanner;
public class Series4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms :");
        n=in.nextInt();
        int a=1;int r=2;
        for (int i=0;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
            

        }


    }
    
}
