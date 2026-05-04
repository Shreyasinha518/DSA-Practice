import java.util.Scanner;
public class spriral {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        System.out.println("ENTER THE VALUE :");
        n=in.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a=i,b=j;
                if(i>n) a= 2*n-i;
                if(j>n) b=2*n-j;
                System.out.print(Math.min(a,b)+" ");

            }
            System.out.println();
        }

    }
    
}
