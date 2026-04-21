import java.util.Scanner;

public class SameNumberTriangle {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=in.nextInt();
        int a=n;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=a;j++){
                System.out.print(i+"  ");
                
            }
            a--;
            System.out.println();
        }

    }
}
