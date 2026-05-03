import java.util.Scanner;

public class flippedInvertedTriangle {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=in.nextInt();
        int a=n;
        for(int i=1;i<=n;i++){
           for(int j=1;j<i;j++){
                System.out.print("  ");
                
            }
            for (int k=1;k<=a;k++){
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }

    }
    
}
