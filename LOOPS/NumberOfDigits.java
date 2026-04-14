import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n=in.nextInt();
    int count=0;
while(n!=0){
    n=n/10;
    count++;
}
System.out.println("NUMBER OF DIGITS:" + count);
}

    
}
