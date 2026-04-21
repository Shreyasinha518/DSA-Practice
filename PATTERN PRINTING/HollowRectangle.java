import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        int m,n;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS:");
        m=in.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS:");
        n=in.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m || j==1 || j==n)
                System.out.print("* ");
            else System.out.print("  ");
            
            }
            System.out.println();
        }
    }
    
}
