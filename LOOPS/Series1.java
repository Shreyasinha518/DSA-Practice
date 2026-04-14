import java.util.Scanner;
public class Series1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms :");
        n=in.nextInt();
        for (int i=2;i<=3*n-1;i+=3){
            
            System.out.println(i);

        }


    }
    
}
