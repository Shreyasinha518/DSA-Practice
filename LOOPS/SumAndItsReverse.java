import java.util.Scanner;

public class SumAndItsReverse {
    public static void main(String[] args) {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n=in.nextInt();
    int temp=n;
    
    int sum=0;
    
    while(temp!=0){
        int d=temp%10;
        sum=sum+d;
        temp=temp/10;
    }
    int r=0;
    int s=sum;
    while(s!=0){
       int d=s%10;
       r=r*10+d;
       s=s/10;
    }
    
    
    
    
System.out.println("SUM OF DIGITS:" + (sum>0?sum:-sum));
System.out.println("REVERSE OF THE SUM IS: "+r);

}

    
    
}
