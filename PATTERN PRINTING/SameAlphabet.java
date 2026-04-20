import java.util.Scanner;
public class SameAlphabet{
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SIDES");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int d=i+64;
                char ch=(char) d;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}