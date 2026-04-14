import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        System.out.println("enter the number whse table is to be printed");
        n=in.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));

        }
    }
    
}
