import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER :");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0){
                    int d=i+64;
                    char ch1=(char) d;
                    System.out.print(ch1+ " ");
                }
                else{
                    int d=i+96;
                    char ch2=(char)d;
                    System.out.print(ch2+" ");
                }
            }
             System.out.println();
        }
    }
    
}
