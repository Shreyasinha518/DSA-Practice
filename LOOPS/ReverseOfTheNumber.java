import java.util.Scanner;
public class ReverseOfTheNumber{
    public static void main(String[] args) {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n=in.nextInt();
    
    int r=0;
    while(n!=0){
        r*=10;
        r+=(n%10);
        n/=10;
    
}
System.out.println("REVERSE OF THE NUMBER:" + r);
}

    
}