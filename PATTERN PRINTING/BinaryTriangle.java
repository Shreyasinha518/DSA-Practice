import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=in.nextInt();
        
        for(int i=0;i<=n;i++){
           
            for(int j=1;j<=i;j++){
                if(i%2==0&&j%2!=0||i%2!=0&&j%2==0)
                    System.out.print("0");
                else System.out.print("1");
                
            }
            System.out.println();
        }

    }
    
}
