import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SIDES");
        n=in.nextInt();
        int d;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                d=j+64;
                char ch=(char)d;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}