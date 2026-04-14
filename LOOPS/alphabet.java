
import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms :");
        n=in.nextInt();
        for (int i=0;i<=n;i++){
            int j=i+65;
            char ch=(char)j;
            
            System.out.println(ch+ " "+ j);

        }


    }
    
}
