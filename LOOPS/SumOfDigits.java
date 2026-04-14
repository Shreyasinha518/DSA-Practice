import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n=in.nextInt();
    
    int sum=0;
    while(n!=0){
        int d=n%10;
        sum=sum+d;
        n=n/10;
    
}
System.out.println("SUM OF DIGITS:" + sum);
}

    
}