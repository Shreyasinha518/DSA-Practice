import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SIDES");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}